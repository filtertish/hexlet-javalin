package org.example.hexlet.model;

public class Car {
    private Long id;
    private String make;
    private String model;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
