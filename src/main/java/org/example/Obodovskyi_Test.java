package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Obodovskyi_Test {
    public static void main(String[] args) {
        Scanner scannerValue = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Task1. Enter the value: ");
        String inValue = scannerValue.nextLine();
        if (Integer.parseInt(inValue) > 7) {
            System.out.println("Привет");
        }

        String name = "Вячеслав";
        System.out.println("Task2. Enter the name: ");
        String inName = scannerValue.nextLine();
        if (inName.equals(name)) {
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }

        System.out.print("Task3. Enter the size of the array: ");
        int size = scannerValue.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements:");

        for (int i = 0; i < size; i++) {
            array[i] = scannerValue.nextInt();
        }

        System.out.println("Elements divisible by 3:");

        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }

}
