package com.qulix.cs.fundamentals.optional3;

import java.util.Scanner;

public class FinderMonth {
    public static void main(String[] args) {
        int monthNumber;
        Scanner scanner;

        System.out.print("Input number of month: ");
        scanner = new Scanner(System.in);
        monthNumber = scanner.nextInt();
        scanner.close();

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Month - " + Months.values()[monthNumber - 1].toString().toLowerCase());
        }
        else {
            System.out.println("You input invalid number of month.");
        }
    }
}
