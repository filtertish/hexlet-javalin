package org.example.hexlet;

import io.javalin.http.Context;
import io.javalin.http.NoContentResponse;
import org.example.hexlet.dto.cars.CarsPage;
import org.example.hexlet.model.Car;
import org.example.hexlet.repository.CarRepository;

import java.sql.SQLException;

import static io.javalin.rendering.template.TemplateUtil.model;

public class CarController {
    public static void index(Context ctx) throws SQLException {
        var cars = CarRepository.getEntities();
        var page = new CarsPage(cars);
        ctx.render("cars/index.jte", model("page", page));
    }

    public static void show(Context ctx) throws SQLException {
        var id = ctx.pathParam("id");
        if (id.isBlank()) {
            throw new NoContentResponse("Entity with given id doesn't exist");
        }

        var car = CarRepository.find(Long.valueOf(id));
        if (car.isPresent()) {
            ctx.render("cars/show.jte", model("car", car.get()));
            return;
        }

        ctx.redirect(NamedRoutes.carsRoot());
    }

    public static void build(Context ctx) {
        ctx.render("cars/build.jte");
    }

    public static void create(Context ctx) throws SQLException {
        var make = ctx.formParam("make");
        var model = ctx.formParam("model");

        var car = new Car(make, model);
        CarRepository.save(car);
        ctx.redirect(NamedRoutes.carsRoot());
    }
}
