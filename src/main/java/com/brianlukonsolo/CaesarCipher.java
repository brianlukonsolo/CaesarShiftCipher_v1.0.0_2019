package com.brianlukonsolo;

import static com.brianlukonsolo.Constants.StringConstants.ALPHABET;

public class CaesarCipher {

    public String encrypt(String plainText, int numberOfShifts) {
        char[] plainTextAsArrayOfChars = plainText.toCharArray();
        StringBuilder encryptedText = new StringBuilder();
        for(char letter : plainTextAsArrayOfChars){
            encryptedText.append(lookUpChar(letter, numberOfShifts, ALPHABET));
        }

        return encryptedText.toString();

    }

    public String decrypt(String encryptedText, int numberOfShifts) {
        char[] encryptedTextAsArrayOfChars = encryptedText.toCharArray();
        StringBuilder decryptedText = new StringBuilder();
        for(char letter : encryptedTextAsArrayOfChars){
            decryptedText.append(lookUpChar(letter, (numberOfShifts * -1), ALPHABET));
        }

        return decryptedText.toString();

    }

    private char lookUpChar(char letter, int numberOfShifts, String characters){
        int indexLimit = characters.length();
        int indexOfLetter = characters.indexOf(letter);
        char result;

        try {
            result = characters.charAt(indexOfLetter + numberOfShifts);
        } catch (IndexOutOfBoundsException e) {
            int indexDifference = (indexLimit - indexOfLetter);
            result = characters.charAt(indexDifference - 1);
        }

        return result;

    }

}
