package com.oefening;

public class GenerateEmailAndPassword {
    public static String generateEmail() {
        String[] letter = {"a", "b", "c", "D", "E", "f"};
        String emailResult = "";
        for (int i = 0; i < 6; i++) {
            int j;
            j = (int) Math.floor(Math.random() * letter.length);
            emailResult = emailResult.concat(letter[j]);
        }
        System.out.println(emailResult + "@gmail.com");
        return emailResult + "@gmail.com";
    }

    public static String generatePassword() {
        String[] letter = {"D", "_", "f", "2", "0", "!"};
        String passwordResult = "";
        for (int i = 0; i < 7; i++) {
            int j;
            j = (int) Math.floor(Math.random() * letter.length);
            passwordResult = passwordResult.concat(letter[j]);
        }
        System.out.println(passwordResult);
        return passwordResult;
    }
}
