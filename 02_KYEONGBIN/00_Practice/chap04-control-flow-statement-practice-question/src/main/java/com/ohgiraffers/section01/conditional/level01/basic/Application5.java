package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the number of people \n(Enter 'q' to quit)");
            String people = sc.nextLine();

            if (people.equalsIgnoreCase("q")) {
                System.out.println("Service is closing.");
                break;
            }

            System.out.println("Enter the number of candies \n(Enter 'q' to quit)");
            String candies = sc.nextLine();

            if (candies.equalsIgnoreCase("q")) {
                System.out.println("Service is closing.");
                break;
            }

            if (!people.matches("\\d+")) {
                System.out.println("Invalid people number. Please enter digits only.");
                continue;
            }

            if (!candies.matches("\\d+")) {
                System.out.println("Invalid candy number. Please enter digits only.");
                continue;
            }

            int peopleNum = Integer.parseInt(people);
            int candiesNum = Integer.parseInt(candies);

            int candiesPerPerson = candiesNum / peopleNum;
            int leftoverCandies = candiesNum % peopleNum;

            System.out.println("Candies for 1 person: " + candiesPerPerson);
            System.out.println("Spare candies: " + leftoverCandies);
        }

        sc.close();
    }
}
