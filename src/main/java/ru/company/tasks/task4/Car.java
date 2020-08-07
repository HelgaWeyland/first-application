package ru.company.tasks.task4;

import ru.company.tasks.task4.interfaces.Rideable;

public class Car extends Vehicle implements Rideable {

    public Car(String name, Color color) {
        super(name, color);
    }

    public Car() {
    }

    public Car(String name) {
        super(name);
    }

    public Car(Color color) {
        super(color);
    }


    @Override
    public void drive() {

    }

    @Override
    public void ride() {
    }

}
