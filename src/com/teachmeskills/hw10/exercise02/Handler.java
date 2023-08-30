package com.teachmeskills.hw10.exercise02;

public class Handler {
    public static void getShortestWord(String p) {
        String[] words = p.split(" ");
        String shortest = words[0];

        for (String word : words) {
            if (shortest.length() >= word.length()) {
                shortest = word;
            }
        }

        System.out.println("Самое короткое слово: " + shortest);
    }

    public static void getLongestWord(String p) {
        String[] words = p.split(" ");
        String longest = words[0];

        for (String word : words) {
            if (longest.length() <= word.length()) {
                longest = word;
            }
        }

        System.out.println("Самое длинное слово: " + longest);
    }
}
