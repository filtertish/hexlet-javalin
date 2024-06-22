package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.users.ErrorData;
import org.example.hexlet.dto.users.UserDto;
import org.example.hexlet.model.Course;
import org.example.hexlet.repository.UsersRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(javalinConfig -> {
            javalinConfig.bundledPlugins.enableDevLogging();
            javalinConfig.fileRenderer(new JavalinJte());
        });

        var usersRepository = new UsersRepository();

        app.get("/", context -> context.render("index.jte"));

        app.get("/hello", context -> {
            var name = context.queryParamAsClass("username", String.class).getOrDefault("World");
            context.result("Hello, " + name + "!");
        });

        app.get("/users", context -> {
            context.render("users/users.jte", model("usersRepository", usersRepository));
        });

        app.post("/users", context -> {
            var username = context.formParam("username");
            var email = context.formParam("email");
            var password = context.formParam("password");
            var passwordAgain = context.formParam("password-again");

            var errorData = new ErrorData(new ArrayList<>());

            if (username == null || username.isBlank()) errorData.errors().add("username field must not be empty");

            if (email == null || email.isBlank()) errorData.errors().add("email field must not be empty");

            if (password == null || passwordAgain == null) errorData.errors().add("password fields must not be empty");

            if (!Objects.equals(password, passwordAgain))
                errorData.errors().add("password and password confirmation isn't the same");

            if (errorData.errors().isEmpty()) {
                usersRepository.addUser(username, email, password);
                context.redirect("/users");
                return;
            }

            var user = new UserDto(username, email);
            context.render("users/build.jte", model("user", user, "errorsDTO", errorData));
        });

        app.get("users/build", context -> {
            context.render("users/build.jte");
        });

        app.get("courses", ctx -> {
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

        app.start(7070);
    }
}
