package com.qulix.cs.fundamentals.optional4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Matrix {

    public static void main(String[] args) {
        int[][] matrix = createRandomMatrix(5, -5, 8);
        print(sortByColumn(matrix,0));
    }

    /**
     * Метод для создания матрицы размером [n][n],
     * заполненной случайными числами от int min до int max включительно
     */
    private static int[][] createRandomMatrix(int size, int minValue, int maxValue) {
        int[][] matrix = new int[size][size];
        Random random = new Random(48);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(maxValue + 1 - minValue) + minValue;
            }
        }

        return matrix;
    }

    /**
     * Метод для вывода переданной в качестве аргумента матрицы в консоль
     */
    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Метод для сортировки строк матрицы в порядке возрастания k-го столбца
     */
    private static int[][] sortByColumn(int[][] matrix, final int column) {
        if (column < matrix.length) {
            Arrays.sort(matrix, new Comparator<int[]>() {
                @Override
                public int compare(final int[] entry1, final int[] entry2) {
                    if (entry1[column] > entry2[column])
                        return 1;
                    else
                        return -1;
                }
            });
        }
        else {
            System.out.println("Illegal argument 'column' exception. Sorting hasn't been done.");
        }
        return matrix;
    }
}
