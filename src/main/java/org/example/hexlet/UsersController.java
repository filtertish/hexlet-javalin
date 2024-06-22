package org.example.hexlet;

import io.javalin.http.Context;
import org.example.hexlet.dto.users.ErrorData;
import org.example.hexlet.dto.users.UserDto;
import org.example.hexlet.repository.UsersRepository;

import java.util.ArrayList;
import java.util.Objects;

import static io.javalin.rendering.template.TemplateUtil.model;

public class UsersController {
    public static void index(Context context) {
        context.render("users/users.jte");
    }

    public static void create(Context context) {
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
            UsersRepository.addUser(username, email, password);
            context.redirect(NamedRoutes.usersRoute());
            return;
        }

        var user = new UserDto(username, email);
        context.render("users/build.jte", model("user", user, "errorsDTO", errorData));
    }

    public static void build(Context context) {
        context.render("users/build.jte");
    }
}
