package org.example;

public class arrayPrograms {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 6, 5, 2};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j]) {
                    System.out.println(a[j]);
                }
        }
        reverse(a, a.length);
    }

    static void reverse(int[] a, int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j--;
        }

        for (int k = 0; k < n; k++) {
            System.out.print(b[k]+" ");
        }
    }


}
