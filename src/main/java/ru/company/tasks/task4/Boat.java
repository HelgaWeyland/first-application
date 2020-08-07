package ru.company.tasks.task4;

import ru.company.tasks.task4.interfaces.Swimable;

public class Boat extends Vehicle implements Swimable {

    public Boat(String name, Color color) {
        super(name, color);
    }

    public Boat() {
    }

    public Boat(String name) {
        super(name);
    }

    public Boat(Color color) {
        super(color);
    }

    @Override
    public void swim() {
    }

    @Override
    public void drive() {

    }
}
