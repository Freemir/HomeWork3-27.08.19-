package com.company;

public class Main {

    public static void main(String[] args) {
        String [] names = {"Ленин", "Сталин", "Малеников"};

        for (int swch = 0; swch < names.length; swch++) {
            switch (swch) {
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
    }
}
