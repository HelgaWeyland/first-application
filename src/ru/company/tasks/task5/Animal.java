package ru.company.tasks.task5;

public class Animal {

    private int age;
    private String name;
    private String color;
    private Sex sex;

    public Animal(int age, String name, String color, Sex sex) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.sex = sex;
    }

    public Animal(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sex getSex() {
        return this.sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Color: " + this.color + ", Sex: " + this.sex;
    }
}
