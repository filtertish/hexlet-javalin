package org.example.hexlet;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.model.Course;
import org.example.hexlet.repository.BaseRepository;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
    public static void main(String[] args) {
        var hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:h2:mem:hexlet_project;DB_CLOSE_DELAY=-1;");
        var dataSource = new HikariDataSource(hikariConfig);

        var url = HelloWorld.class.getClassLoader().getResourceAsStream("schema.sql");
        var sql = new BufferedReader(new InputStreamReader(url))
                .lines().collect(Collectors.joining("\n"));

        try (var connection = dataSource.getConnection(); var statement = connection.createStatement()) {
            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        BaseRepository.dataSource = dataSource;

        var app = Javalin.create(javalinConfig -> {
            javalinConfig.bundledPlugins.enableDevLogging();
            javalinConfig.fileRenderer(new JavalinJte());
        });

        app.get("/", context -> {
            var visited = Boolean.valueOf(context.cookie("visited"));
            var authorized = context.sessionAttribute("currentUser");

            context.render("index.jte", model("visited", visited, "authorized", authorized));
            context.cookie("visited", String.valueOf(true));
        });

        app.get(NamedRoutes.helloRoute(), context -> {
            var name = context.queryParamAsClass("username", String.class).getOrDefault("World");
            context.result("Hello, " + name + "!");
        });

        app.get(NamedRoutes.usersRoute(), UsersController::index);

        app.post(NamedRoutes.usersRoute(), UsersController::create);

        app.get(NamedRoutes.buildUsersRoot(), UsersController::build);

        app.get(NamedRoutes.coursesRoot(), ctx -> {
            var flash = ctx.consumeSessionAttribute("flash");

            var page = new CoursePage("Programming courses");
            var term = ctx.queryParam("term");
            List<Course> result = List.of();

            if (term == null) {
                result = page.getCourses();
            }

            if (term != null) {
                result = page.getCourses()
                        .stream()
                        .filter(course -> course.name().toLowerCase().contains(term.toLowerCase()))
                        .toList();
            }

            ctx.render("courses/show.jte", model("page", new CoursePage(result, page.getHeader(), term),
                    "flash", flash != null));
        });

        app.post(NamedRoutes.coursesRoot(), ctx -> {
            ctx.sessionAttribute("flash", "Course hasn't been created :)");
            ctx.redirect(NamedRoutes.coursesRoot());
        });

        app.get("courses/{id}", ctx -> {
            var courses = new CoursePage("Programming courses").getCourses();
            var id = ctx.pathParamAsClass("id", Long.class).getOrDefault(null);
            Course course = null;

            for (var c : courses) {
                if (id == c.id()) {
                    course = c;
                    break;
                }
            }

            ctx.render("index.jte", model("course", course, "id", id));
        });

        app.get(NamedRoutes.buildSessionsRoot(), SessionsController::build);
        app.post(NamedRoutes.sessionsRoot(), SessionsController::create);

        app.get(NamedRoutes.carsRoot(), CarController::index);
        app.get(NamedRoutes.buildCarsRoot(), CarController::build);
        app.get(NamedRoutes.showCarsRoot("{id}"), CarController::show);
        app.post(NamedRoutes.carsRoot(), CarController::create);

        app.start(7070);
    }
}
