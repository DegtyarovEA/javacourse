package com.qulix.cs.fundamentals.optional2;

import java.util.ArrayList;
import java.util.Scanner;

public class LengthNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = readNumbers();
        System.out.println(minAndMaxLength(numbers));
        System.out.println(sortByLength(numbers));
    }

    /**
     * Метод для поиска самого короткого и сомго длинного числа из заданного списка.
     */
    private static String minAndMaxLength(ArrayList<Integer> array) {
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
     * Метод для вывода чисел в порядке возрастания их длины.
     */
    private static String sortByLength(ArrayList<Integer> array) {
        StringBuilder result = new StringBuilder();

        while (!array.isEmpty()) {
            int index = 0;
            int minNumber = array.get(0);

            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).toString().length() < Integer.toString(minNumber).length()) {
                    minNumber = array.get(i);
                    index = i;
                }
            }
            result.append(minNumber).append(" ");
            array.remove(index);
        }
        return result.toString();
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
