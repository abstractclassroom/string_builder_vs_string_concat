package io.github.nathanjrussell;

import java.util.Random;

public class Main {

    private static void test1(int test_size, long seed) {
        Random random1 = new Random(seed);
        long startTime = System.nanoTime();
        String test = "Nathan is so cool";
        for (int i = 0; i < test_size; i++) {
            test += "How about a random number: " + random1.nextInt() + "\n";
            test += "Nathan is still cool\n";
        }
        int stringLength = test.length();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("String length: " + stringLength);
        System.out.println("Duration: " + duration + " milliseconds");
    }

    public static void test2(int test_size, long seed) {
        Random random2 = new Random(seed);
        long startTime = System.nanoTime();
        StringBuilder test2 = new StringBuilder();
        for (int i = 0; i < test_size; i++) {
            test2.append("How about a random number: ").append(random2.nextInt()).append("\n");
            test2.append("Nathan is still cool\n");
        }
        String test2String = test2.toString();
        int stringLength = test2.length();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("String length: " + stringLength);
        System.out.println("Duration: " + duration + " milliseconds");
    }

    public static void main(String[] args) {
        test2(100000, 333L);
        test1(100000, 333L);




    }
}
