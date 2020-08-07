package ru.company.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.util.Comparator.comparingInt;

public class Task3 {

    private static final Random random = new Random();

    private static final int AMOUNT_NUMBERS = 30;
    private static final int MAX_VALUE = 999;
    private static final int MIN_VALUE = MAX_VALUE * -1;


    public static void execute() {
        int[] array = getArrayWithRandomValues(AMOUNT_NUMBERS, MIN_VALUE, MAX_VALUE);
        array[0] = 5;
        array[1] = 9;

        final List<Integer> factorials = new ArrayList<>();
        final List<Integer> doubleDigitNumbers = new ArrayList<>();

        final List<Integer> oddNumbers = new ArrayList<>();
        final List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            final int value = array[i];
            int finalValue = value;
            if (finalValue < 0) {
                finalValue = Math.abs(value);
            }
            final String stringValue = String.valueOf(finalValue);

            switch (stringValue.length()) {
                case 1: {
                    if (value > 0) {
                        factorials.add(calculateFactorial(value));
                    }
                }
                break;
                case 2: {
                    if (isEven(value)) {
                        doubleDigitNumbers.add(value / 2);
                    } else {
                        doubleDigitNumbers.add(value * 3);
                    }
                    break;
                }
                case 3: {
                    if (isEven(i)) {
                        evenNumbers.add(value);
                    } else {
                        oddNumbers.add(value);
                    }
                }
                default:
                    break;
            }
        }

        final int min = evenNumbers.stream()
                .min(comparingInt(s -> s))
                .orElse(0);

        final int max = oddNumbers.stream()
                .max(comparingInt(s -> s))
                .orElse(0);

        System.out.println("Values: " + Arrays.toString(array));
        System.out.println("Factorials: " + factorials.toString());
        System.out.println("Double digit numbers: " + doubleDigitNumbers.toString());
        System.out.println("MINIMUM: " + min);
        System.out.println("MAXIMUM: " + max);
    }

    private static boolean isEven(int value) {
        return value % 2 == 0;
    }

    private static int calculateFactorial(int value) {
        int factorial = 1;

        for (int j = 1; j <= value; j++) {
            factorial *= j;
        }

        return factorial;
    }

    public static int[] getArrayWithRandomValues(int amountNumbers, int minValue, int maxValue) {
        int[] array = new int[amountNumbers];

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInt(minValue, maxValue);
        }

        return array;
    }

    private static int getRandomInt(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

}