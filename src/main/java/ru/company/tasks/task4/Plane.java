package ru.company.tasks.task4;

import ru.company.tasks.task4.interfaces.Flyable;

public class Plane extends Vehicle implements Flyable {

    public Plane(String name, Color color) {
        super(name, color);
    }

    public Plane() {
    }

    public Plane(String name) {
        super(name);
    }

    public Plane(Color color) {
        super(color);
    }

    @Override
    public void drive() {

    }
    @Override
    public void fly(){

    }
}
