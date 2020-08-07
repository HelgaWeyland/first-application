package ru.company.tasks.task5;

import java.util.*;

public class Task5 {

    public static final String CATS = "Cats";
    public static final String DOGS = "Dogs";
    public static final String DUCKS = "Ducks";

    private static Map<String, List<Animal>> animals;

    public static void execute() {
        animals = getAnimalsMap();

        System.out.println("Animals");
        printMap();

        filterAnimalsByAge(2);

        System.out.println("Filtered by age: ");
        printMap();
    }

    private static void filterAnimalsByAge(int age) {
        for (Map.Entry<String, List<Animal>> next : animals.entrySet()) {
            List<Animal> value = next.getValue();
            value.removeIf(animal -> animal.getAge() > age);
        }
    }

    private static void printMap() {
        for (Map.Entry<String, List<Animal>> entry : animals.entrySet()) {
            String key = entry.getKey();
            List<Animal> animalList = entry.getValue();

            System.out.println(key + ":");
            for (Animal animal : animalList) {
                final String baseString = "Name: " + animal.getName() + ", Age: " + animal.getAge();
                if (DUCKS.equals(key)) {
                    System.out.println(baseString + ", Sex: " + animal.getSex());
                }
                if (CATS.equals(key) || DOGS.equals(key)) {
                    System.out.println(baseString + ", Color: " + animal.getColor());
                }
            }
        }
    }

    private static Map<String, List<Animal>> getAnimalsMap() {
        Map<String, List<Animal>> animals = new HashMap<>();

        List<Animal> ducks = new ArrayList<>();
        ducks.add(new Duck(1, "Huey", "Grey", Sex.MALE));
        ducks.add(new Duck(2, "Dewey", "white", Sex.MALE));
        ducks.add(new Duck(3, "Louie", "Black", Sex.MALE));

        List<Animal> cats = new ArrayList<>();
        cats.add(new Cat(5, "Behemoth", "Black"));
        cats.add(new Cat(7, "Tom", "Grey"));
        cats.add(new Cat(2, "Garfield", "Ginger"));

        List<Animal> dogs = new ArrayList<>();
        dogs.add(new Dog(13, "Lassy", "White"));
        dogs.add(new Dog(2, "Lady", "Brown"));
        dogs.add(new Dog(6, "Jake", "Yellow"));

        animals.put(CATS, cats);
        animals.put(DOGS, dogs);
        animals.put(DUCKS, ducks);

        return animals;
    }
}
