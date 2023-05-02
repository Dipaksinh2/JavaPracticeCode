package org.example;

public class Reverse {
    public static void main(String[] args) {
        String st = "Hello    World!    how     are    you";
        System.out.println(st);

        System.out.println(st.replaceAll("l", "c"));
        StringBuilder in = new StringBuilder();
        in.append(st);
        in.reverse();
        System.out.println(in);

        char[] c = st.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
        }

        System.out.println();

        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j < st.length(); j++) {
                if (c[i] == c[j]) {
                    System.out.print(c[j]);
                    break;
                }
            }

        }
    }
}
