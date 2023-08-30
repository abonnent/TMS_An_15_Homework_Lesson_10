package com.teachmeskills.hw10.exercise03;

public class Main {
    public static void main(String[] args) {
        String s = "Привет";
        doubleLetter(s);
    }

    public static void doubleLetter(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            sb.append(ch);
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
