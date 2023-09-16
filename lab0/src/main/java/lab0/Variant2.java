package lab0;

import java.util.Scanner;

public class Variant2 {

    public static double mass(double m) {
        return m / 1000;
    }

    public static boolean odd(int a) {
        return a % 2 != 0;
    }

    public static double check(int x) {
        if (x > 0) {
            return x + 1;
        }
        return x - 2;

    }

    public static String selectStatement(int k) {
        return switch (k) {
            case 1 -> "Badly";
            case 2 -> "Unsatisfactorily";
            case 3 -> "Satisfactorily";
            case 4 -> "Good";
            case 5 -> "Perfect";
            default -> "Error";
        };
    }

    public static int[] generateNumbersBetween(int a, int b) {

        if (a >= b) throw new IllegalArgumentException(" A must be more than B");

        int N = b - a + 1;
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = a + i;
        }
        return numbers;


    }

    public static int numOfSection(int a, int b) {
        if (a < 0 || b < 0 || a < b) {
            return -1;
        }
        int n = 0;
        while (a - b >= 0) {
            a -= b;
            n++;
        }
        return n;

    }

    public static int[] powerOfTwo(int n) {
        int[] powerOfTwo = new int[n];
        int power = 2;
        for (int i = 0; i < n; i++) {
            powerOfTwo[i] = power;
            power *= 2;
        }

        return powerOfTwo;
    }

    public static int[][] jColumn(int m, int n) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                a[i][j] = 5 * (j + 1);
            }
        }
        return a;
    }

}




