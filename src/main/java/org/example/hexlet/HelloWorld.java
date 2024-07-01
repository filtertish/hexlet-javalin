package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.model.Course;

import java.util.List;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
    public static void main(String[] args) {
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

            ctx.render("courses/show.jte", model("page", new CoursePage(result, page.getHeader(), term)));
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

        app.start(7070);
    }
}
