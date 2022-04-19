package com.company;

import java.time.LocalDate;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

	// Задание 1
        System.out.println("Задание 1");

        int yearTask1 = 2020;
        task1(yearTask1);

        System.out.println("=================================");

    // Задание 2
        System.out.println("Задание 2");

        int clientOS = 1;
        int currentYear = LocalDate.now().getYear();
        tastTwo(clientOS,currentYear);

        System.out.println("=================================");


    // Задание 3
        System.out.println("Задание 3");

        int deliveryDistance = 61;
        deliveryDistances(deliveryDistance);

        System.out.println("=================================");



    // Задание 4
        System.out.println("Задание 4");

        String str = "aabccddefgghiijjkk";
        char[] myArray = str.toCharArray();
        taskFour(myArray);

        System.out.println("=================================");


    // Задание 5
        System.out.println("Задание 5");

        int[] task5 = {3, 2, 1, 6, 5};
        taskX(task5);

        System.out.println();
        System.out.println("=================================");


    }

    public static void task1(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static int[] taskX(int[] taskX) {
        for (int i = taskX.length - 1; i > 0; i--) {
            System.out.print(taskX[i] + ", ");
        }
        System.out.print(taskX[0]);
        return taskX;
    }

    public static int deliveryDistances(int deliveryDistances) {
        int deliveryDays = 1;
        if (deliveryDistances <= 20) {
            System.out.println("Доставка займет " + deliveryDays + " дня");
        } else if (deliveryDistances > 20 && deliveryDistances <= 60) {
            System.out.println("Доставка займет " + (deliveryDays + 1) + " дня");
        } else if (deliveryDistances > 60 && deliveryDistances <= 100) {
            System.out.println("Доставка займет " + (deliveryDays + 2) + " дня");
        } else {
            System.out.println("На такое расстояние не доставляем");
        } return deliveryDistances;
    }

     public static void tastTwo(int clientOS, int clientDeviceYear) {
         if (clientOS == 0 && clientDeviceYear >= 2015) {
             System.out.println("Установите версию приложения для Android по ссылке");
         } else if (clientOS == 0 && clientDeviceYear < 2015) {
             System.out.println("Установите облегченную версию приложения для Android по ссылке");
         } else if (clientOS == 1 && clientDeviceYear >= 2015) {
             System.out.println("Установите версию приложения для iOS по ссылке");
         } else if (clientOS == 1 && clientDeviceYear < 2015) {
             System.out.println("Установите облегченную версию приложения для iOS по ссылке");
         }
     }

     public static void taskFour (char[] myArray ) {
         for (int i = 0; i < myArray.length - 1; i++) {
                 if (myArray[i] == myArray[i++]) {
                     System.out.println("Найден дубль - " + myArray[i++]);
                     break;
                 } else {
                       System.out.println("Дублей не найдено");
                 }

             }
         }
     }


