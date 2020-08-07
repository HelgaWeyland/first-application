package ru.company.tasks;

public class Task2 {
    public static void execute() {
        for (int i = 2; i < 10; i++) {
            for (int y = 2; y < 10; y++) {
                int m = i * y;
                System.out.printf("%d * %d = %d \t|\t", y, i, m);
            }
            System.out.println();
        }
    }
}
