package com.qulix.cs.fundamentals.optionalTask1;

import java.util.Scanner;

public class WelcomeUser {
    public static void main(String[] args) {
        String name;
        Scanner scanner;

        System.out.print("Input your name: ");
        scanner = new Scanner(System.in);
        name = scanner.nextLine();
        scanner.close();

        System.out.println("Hello, " + name + "!");
    }
}
