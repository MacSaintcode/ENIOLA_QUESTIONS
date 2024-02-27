package saintcoded;

import java.util.Arrays;

public class basketball {

    basketball(String arr[]) {
        int n = 0;
        int u = 0;
        int newarr[] = new int[arr.length];
        while (u < arr.length) {
            try {

                newarr[n] = Integer.parseInt(arr[u]);

            } catch (NumberFormatException e) {
                switch (arr[u].toLowerCase()) {
                    case "+":
                        newarr[n] = newarr[n - 2] + newarr[n - 1];
                        break;
                    case "d":
                        newarr[n] = newarr[n - 1] * 2;

                        break;
                    case "c":
                        newarr[n - 1] = 0;
                        n = n - 2;
                        break;
                    default:
                        System.err.println("Invalid Function key "+ arr[u]);
                        n--;
                        break;
                }
            } finally {
                n++;
                u++;
            }
        }
        int sum = 0;

        for (int i : newarr) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(newarr));
    }

    public static void main(String[] args) {
        String arr[] = { "5", "2", "C", "D","6", "O","G","+" };
        new basketball(arr);
    }
}
