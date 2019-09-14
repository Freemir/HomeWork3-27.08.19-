package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Ленин", "Сталин", "Малеников"};

        for (int i = 0; i < names.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Доброе утро " + names[0]);
                    break;
                case 1:
                    System.out.println("Доброй день " + names[1]);
                    break;
                case 2:
                    System.out.println("Добрый вечер " + names[2]);
                    break;
            }
        }

        System.out.println();

        String[] namesCopy = Arrays.copyOf(names, names.length + 1);
        namesCopy[3] = "Хрущёв";
        for (int i = 0; i < namesCopy.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Доброе утро " + namesCopy[0]);
                    break;
                case 1:
                    System.out.println("Доброй день " + namesCopy[1]);
                    break;
                case 2:
                    System.out.println("Добрый вечер " + namesCopy[2]);
                    break;
                case 3:
                    System.out.println("Здраствуйте " + namesCopy[3]);
            }
        }
    }
}
