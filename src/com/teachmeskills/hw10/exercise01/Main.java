package com.teachmeskills.hw10.exercise01;

public class Main {
    public static void main(String[] args) {
        String documentNumber = "5554-ABc-5678-JoL-1a2b";
        Handler.getDocumentNumberDigitBlock(documentNumber);
        Handler.getDocumentNumberHiddenLetters(documentNumber);
        Handler.getDocumentNumberFormattedLetters(documentNumber);
        Handler.getDocumentNumberFormattedString(documentNumber);
        Handler.getDocumentNumberSequence(documentNumber, "aBc");
        Handler.getDocumentNumberStartWith(documentNumber, "551");
        Handler.getDocumentNumberEndWith(documentNumber, "1a2b");
    }
}
