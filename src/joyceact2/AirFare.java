
package joyceact2;

import java.util.Scanner;


public class AirFare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Kilometers: ");
        double distance = scanner.nextDouble();

        System.out.println("Select a class:");
        System.out.println("1: Economy Class");
        System.out.println("2: Business Class");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double baseFarePerKm;

        if (choice == 1) {
            baseFarePerKm = 250;
        } else if (choice == 2) {
            baseFarePerKm = 500;
        } else {
            System.out.println("Invalid class selection!");
            return;
        }

        double totalFare = distance * baseFarePerKm;

        if (distance > 1000) {
            totalFare *= 0.9;
        }

        System.out.printf("Total Fare: ₱%.2f%n", totalFare);
    }
}
    