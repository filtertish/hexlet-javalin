package org.example.hexlet.repository;

import org.example.hexlet.model.Car;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarRepository extends BaseRepository {
    public static void save(Car car) throws SQLException {
        var sql = "INSERT INTO cars (make, model) VALUES (?, ?)";
        try (var connection = dataSource.getConnection();
             var statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, car.getMake());
            statement.setString(2, car.getModel());
            statement.executeUpdate();

            var generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) car.setId(generatedKeys.getLong(1));
            else throw new SQLException("DB have not returned ID after creating entity");
        }
    }

    public static Optional<Car> find(Long id) throws SQLException {
        var sql = "SELECT * FROM cars WHERE id = ?";
        try (var connection = dataSource.getConnection();
             var statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            var resultSet = statement.executeQuery();
            if (resultSet.next()) {
                var make = resultSet.getString("make");
                var model = resultSet.getString("model");
                var car = new Car(make, model);
                car.setId(id);
                return Optional.of(car);
            } else {
                return Optional.empty();
            }
        }
    }

    public static List<Car> getEntities() throws SQLException {
        var sql = "SELECT * FROM cars";
        try (var connection = dataSource.getConnection();
             var statement = connection.prepareStatement(sql)) {
            var resultSet = statement.executeQuery();
            var result = new ArrayList<Car>();

            while (resultSet.next()) {
                var id = resultSet.getLong("id");
                var make = resultSet.getString("make");
                var model = resultSet.getString("model");
                var car = new Car(make, model);
                car.setId(id);
                result.add(car);
            }

            return result;
        }
    }
}
