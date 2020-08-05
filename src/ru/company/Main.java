package ru.company;


import ru.company.tasks.Task1;
import ru.company.tasks.Task2;
import ru.company.tasks.Task3;
import ru.company.tasks.task4.Task4;
import ru.company.tasks.task5.Task5;

public class Main {

    private static final String DELIMITER = "______________________________________________";

    public static void main(String[] args) {
        System.out.println("Task 1: ");
        Task1.execute();

        System.out.println(DELIMITER);

        System.out.println("Task 2: ");
        Task2.execute();

        System.out.println(DELIMITER);

        System.out.println("Task 3: ");
        Task3.execute();

        System.out.println(DELIMITER);

        System.out.println("Task 4: ");
        Task4.execute();

        System.out.println(DELIMITER);

        System.out.println("Task 5: ");
        Task5.execute();
    }
}

