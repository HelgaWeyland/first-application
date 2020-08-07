package ru.company.tasks.task4;

import ru.company.tasks.task4.interfaces.Rideable;

public class Bike extends Vehicle implements Rideable {

    public Bike(String name, Color color) {
        super(name, color);
    }

    public Bike() {
    }

    public Bike(String name) {
        super(name);
    }

    public Bike(Color color) {
        super(color);
    }

    @Override
    public void ride() {
    }

    @Override
    public void drive() {

    }
}
