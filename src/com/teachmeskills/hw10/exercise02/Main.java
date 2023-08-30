package com.teachmeskills.hw10.exercise02;

import com.teachmeskills.hw10.exercise02.Handler;

public class Main {
    public static void main(String[] args) {
        String p = "Люблю грозу в начале,мая. Когда весенний первый гром Как бы резвяся и играя Грохочет в небе голубом";

        Handler.getShortestWord(p);
        Handler.getLongestWord(p);
    }
}
