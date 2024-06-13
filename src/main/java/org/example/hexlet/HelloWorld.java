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

        app.start(7070);
    }
}
