/*
Author: Jahnavi Singh Chauhan
Roll No.: R2142220526
SAP ID: 500102342
Date: 13/10/2023
 */

import java.util.Scanner;

public class fooditem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your Choice");
            System.out.println("1. Enter your Choice of the Day");
            System.out.println("2. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your choice of the day: \n - Monday\n - Tuesday\n - Wednesday\n - Thursday\n - Friday\n - Saturday\n - Sunday\n-----------------------------------\n");
                    scanner.nextLine();
                    String day = scanner.nextLine();
                    String foodItem;

                    if (day.equalsIgnoreCase("monday")) {
                        foodItem = "Italian Cuisine";
                    } else if (day.equalsIgnoreCase("tuesday")) {
                        foodItem = "Indian Cuisine";
                    } else if (day.equalsIgnoreCase("wednesday")) {
                        foodItem = "Thai Cuisine";
                    } else if (day.equalsIgnoreCase("thursday")) {
                        foodItem = "French Cuisine";
                    } else if (day.equalsIgnoreCase("friday")) {
                        foodItem = "Chinese Cuisine";
                    } else if (day.equalsIgnoreCase("saturday")) {
                        foodItem = "Japanese Cuisine";
                    } else if (day.equalsIgnoreCase("sunday")) {
                        foodItem = "Thai Cuisine";
                    } else {
                        System.out.println("Select a Valid Day.\n\n");
                        break;
                    }
                    System.out.println("You will be served " + foodItem + " on " + day + ".\n\n");
                    break;
                case 2:
                    System.out.println("Program is Exited\n\n");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select 1 or 2.\n\n");
            }
        }
    }
}
