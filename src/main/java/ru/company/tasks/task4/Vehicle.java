package ru.company.tasks.task4;

import ru.company.tasks.task4.interfaces.Driveable;

abstract class Vehicle implements Driveable {
    private String name;
    private Color color;

    public Vehicle(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final String typeName = getClass().getSimpleName();
        return "{ type: " + typeName + ", name: " + name + ", color: " + color + " }";
    }

    @Override
    public abstract void drive();
}
