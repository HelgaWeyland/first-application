package ru.company.tasks.task5;

import java.util.*;

public class Task5 {

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
        for (Map.Entry<String, List<Animal>> entry : animals.entrySet()) {
            List<Animal> filteredList = new ArrayList<>();

            String key = entry.getKey();
            List<Animal> animalList = entry.getValue();

            for (Animal animal : animalList) {
                if (animal.getAge() <= age) {
                    filteredList.add(animal);
                }
            }

            animals.put(key, filteredList);
        }
    }

    private static void printMap() {
        for (Map.Entry<String, List<Animal>> entry : animals.entrySet()) {
            String key = entry.getKey();
            List<Animal> animalList = entry.getValue();

            System.out.println(key + ":");
            animalList.forEach(System.out::println);
        }
    }

    private static Map<String, List<Animal>> getAnimalsMap() {
        Map<String, List<Animal>> animals = new HashMap<>();

        List<Animal> ducks = List.of(
                new Duck(1, "Huey", "Grey"),
                new Duck(2, "Dewey", "white"),
                new Duck(3, "Louie", "Black")
        );

        List<Animal> cats = List.of(
                new Cat(5, "Behemoth", "Black"),
                new Cat(7, "Tom", "Grey"),
                new Cat(2, "Garfield", "Ginger")
        );

        List<Animal> dogs = List.of(
                new Dog(13, "Lassy", "White"),
                new Dog(2, "Lady", "Brown"),
                new Dog(6, "Jake", "Yellow")
        );

        animals.put("Cats", cats);
        animals.put("Dogs", dogs);
        animals.put("Ducks", ducks);

        return animals;
    }
}
