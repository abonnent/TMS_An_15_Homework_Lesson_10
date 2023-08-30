package com.teachmeskills.hw10.exercise01;

public class Handler {
    public static void getDocumentNumberDigitBlock(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.println(blocks[0] + blocks[2]);
    }

    public static void getDocumentNumberHiddenLetters(String documentNumber) {
        String hiddenLetters = documentNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(hiddenLetters);
    }

    public static void getDocumentNumberFormattedLetters(String documentNumber) {
        String formattedString = documentNumber.replaceAll("[-\\d]", "/").replaceAll("/+", "/").substring(1).toLowerCase();
        System.out.println(formattedString);
    }

    public static void getDocumentNumberFormattedString(String documentNumber) {
        String formattedString = documentNumber.replaceAll("[-\\d]", "/").replaceAll("/+", "/").substring(1).toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append("Letters:");
        sb.append(formattedString);
        System.out.println(sb);
    }

    public static void getDocumentNumberSequence(String documentNumber, String needle) {
        String dn = documentNumber.toLowerCase();
        String n = needle.toLowerCase();
        if (dn.contains(n)) {
            System.out.println("Есть вхождение");
        } else {
            System.out.println("Нет вхождений");
        }
    }

    public static void getDocumentNumberStartWith(String documentNumber, String needle) {
        if (documentNumber.startsWith(needle)) {
            System.out.println("Строка начинается на " + needle);
        } else {
            System.out.println("Строка не начинается на " + needle);
        }
    }

    public static void getDocumentNumberEndWith(String documentNumber, String needle) {
        if (documentNumber.endsWith(needle)) {
            System.out.println("Строка заканчивается на " + needle);
        } else {
            System.out.println("Строка не заканчивается на " + needle);
        }
    }
}
