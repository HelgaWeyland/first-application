package ru.company.tasks.task4;

import java.util.List;

public class Task4 {
    public static void execute() {
        Vehicle boat = new Boat("titanic", Color.BLACK);

        List<Vehicle> vehicles = List.of(
                boat,
                new Car("ford", Color.RED),
                new Bike("harley", Color.PURPLE),
                new Plane("Boeing 747", Color.BLACK)
        );

        printVehicles(vehicles);
        System.out.println("Boat color: " + boat.getColor());
    }

    public static void printVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.toString());
            }
    }

}
