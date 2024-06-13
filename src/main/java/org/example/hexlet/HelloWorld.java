package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(javalinConfig -> javalinConfig.bundledPlugins.enableDevLogging());

        app.get("/", context -> context.result("Main page!"));

        app.get("/hello", context -> {
            var name = context.queryParamAsClass("name", String.class).getOrDefault("World");
            context.result("Hello, " + name + "!");
        });

        app.get("/users/{id}/post/{postId}", context -> {
            var userId = context.pathParam("id");
            var postId = context.pathParam("postId");
            context.result(String.format("First param: %s\nSecond param: %s", userId, postId));
        });

        app.start(7070);
    }
}
