package com.qulix.cs.fundamentals.optionalTask2;

import java.util.ArrayList;
import java.util.Scanner;

public class LengthNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = readNumbers();
        System.out.println(minAndMaxLength(numbers));
    }

    /**
     * Метод для поиска самого короткого и сомго длинного числа из заданного списка.
     */
    public static String minAndMaxLength(ArrayList<Integer> array) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).toString().length() > array.get(maxIndex).toString().length()) {
                maxIndex = i;
            }
            if (array.get(i).toString().length() < array.get(minIndex).toString().length()) {
                minIndex = i;
            }
        }

        return "Num with max length: " + array.get(maxIndex) + ", length = " + array.get(maxIndex).toString().length() +
                "\nNum with min length: " + array.get(minIndex) + ", length = " + array.get(minIndex).toString().length();
    }

    /**
     * Метод для создания списка чисел, введенных с клавиатуры.
     */
    private static ArrayList<Integer> readNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Input numbers. To exit input '-1'.");

        int inputNum;
        do {
            inputNum = input.nextInt();
            if (inputNum != -1){
                numbers.add(inputNum);
            }
        } while (inputNum != -1);
        input.close();

        return numbers;
    }
}
