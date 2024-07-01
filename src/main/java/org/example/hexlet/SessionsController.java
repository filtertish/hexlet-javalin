package org.example.hexlet;

import io.javalin.http.Context;

public class SessionsController {
    public static void build(Context context) {
        context.render("sessions/build.jte");
    }

    public static void create(Context context) {
        var nickname = context.formParam("username");
        context.sessionAttribute("currentUser", nickname);
        context.redirect("/");
    }
}
