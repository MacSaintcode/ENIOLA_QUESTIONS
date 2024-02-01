package saintcoded;

import java.util.Arrays;

public class Main {

    static int sum(int a, int b) {
        int i;
        i = a + b;
        return i;
    }

    static int difference(int a, int b) {
        int i;
        i = a - b;
        return i;
    }

    static double division(int a, int b) {
        int i;
        i = a / b;
        return i;
    }

    static int multiplication(int a, int b) {
        int i;
        i = a * b;
        return i;
    }

    static int remainder(int a, int b) {
        int i;
        i = a % b;
        return i;
    }

    static boolean isodd(int a) {

        if (a % 2 != 0) {
            return true;
        }
        return false;

    }

    static boolean isEven(int a) {

        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    static int lowest(int[] list) {
        int u = list[0];
        for (int j = 0; j < list.length; j++) {
            if (u == list[j]) {
                continue;
            }
            if (u > list[j]) {
                u = list[j];
                j = 0;
            }
        }
        return u;
    }

    static int highest(int[] list) {
        int u = list[0];
        for (int j = 0; j < list.length; j++) {
            if (u == list[j]) {
                continue;
            }
            if (u < list[j]) {
                u = list[j];
                j = 0;
            }
        }
        return u;
    }

    static double average(int[] list) {
        int u = 0;
        for (int i : list) {
            u += i;
        }
        u = u / 2;
        return u;
    }

    static int[] reversed(int[] list) {
        int newarr[] = new int[list.length];
        int len = list.length - 1;
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = list[len];
            len--;
        }
        return newarr;
    }

    static int determinant(int[][] matrix) {
        int determinant = 0;
        int arr[] = new int[matrix.length];
        int k = 0;

        for (int i = 0; i < matrix[0].length; i += 2) {
            arr[k] = matrix[0][i] * matrix[1][i + 1];
            k++;
            arr[k] = matrix[1][i] * matrix[0][i + 1];
            k++;
        }
        determinant = arr[0];
        for (int i = 1; i < arr.length; i++) {
            determinant -= arr[i];
        }

        return determinant;
    }

    public static void main(String[] args) {
        Main call = new Main();
        // System.out.println(Arrays.toString(call.reversed(new int[] { 4, 0, 20, 1
        // })));
        // System.out.println(call.average(new int[] { 4, 0, 20, 1 }));
        System.out.println(call.determinant(new int[][] { { 4, 0 }, { 3, 7 } }));

    }
}
