package ru.company.tasks.task4;

import ru.company.tasks.task4.interfaces.Driveable;
import ru.company.tasks.task4.interfaces.Rideable;

public class Train extends Vehicle implements Rideable, Driveable {

    public Train(String name, Color color) {
        super(name, color);
    }

    public Train() {
    }

    public Train(String name) {
        super(name);
    }

    public Train(Color color) {
        super(color);
    }

    @Override
    public void ride() {

    }

    @Override
    public void drive() {

    }
}
