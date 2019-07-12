package com.qulix.cs.io;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class FileCreatorRandomIntegers {
    private static final Random random = new Random();
    private final File path;

    public static void main(String[] args) {
        File file = new File("D://test.txt");
        FileCreatorRandomIntegers fc = new FileCreatorRandomIntegers(file);
        fc.createFile(fc.createRandomArray());
        fc.createFile(fc.sortIntegersFromFile());
    }

    FileCreatorRandomIntegers(File path) {
        this.path = path;
    }

    private int[] createRandomArray() {
        int[] array = new int[random.nextInt(15)];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextInt(100));
        }
        return array;
    }

    public void createFile(int[] array) {
        try (final FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < array.length; i++) {
                final String s = Integer.toString(array[i]);
                writer.write(s);
                writer.write(System.lineSeparator());
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int[] sortIntegersFromFile() {
        int[] sortedArray = new int[100];
        try (final BufferedReader reader = new BufferedReader(new FileReader(path))) {
            sortedArray = reader.lines().mapToInt(Integer::parseInt).toArray();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
