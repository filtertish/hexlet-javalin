package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.http.NotFoundResponse;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.model.Course;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(javalinConfig -> {
            javalinConfig.bundledPlugins.enableDevLogging();
            javalinConfig.fileRenderer(new JavalinJte());
        });

        app.get("/", context -> context.render("index.jte"));

        app.get("/hello", context -> {
            var name = context.queryParamAsClass("name", String.class).getOrDefault("World");
            context.result("Hello, " + name + "!");
        });

        app.get("/users/{id}/post/{postId}", context -> {
            var userId = context.pathParam("id");
            var postId = context.pathParam("postId");
            context.result(String.format("First param: %s\nSecond param: %s", userId, postId));
        });

        app.get("courses", ctx -> {
            var page = new CoursePage("Programming courses");

            ctx.render("courses/show.jte", model("page", page));
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
