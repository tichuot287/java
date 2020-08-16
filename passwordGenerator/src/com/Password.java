package com;

public class Password {
    public static void main(String[] args) {
        String result = makePassword(10);
        System.out.println(result);

    }

    /** Generate password */
    public static String makePassword (int length) {
        String password = "";

        for (int i = 0; i < length -2; i++){
            password = password + randomCharacter("abcdefghiklmnopqrstuvwxyz");

            String randomDigit = randomCharacter("0123456789");
            password = insertAtRandom(password, randomDigit);

            String randomSymbol = randomCharacter("+-)(*&^%$#@!_=?></|~`");
            password = insertAtRandom(password, randomSymbol);
        }


        return password;
    }

    /** Get random character from string */
    public static String randomCharacter(String characters) {
        int n = characters.length();
        int r = (int)(n * Math.random());
        return characters.substring(r, r + 1);
    }
    /** Insert one string into another at a random position */
    public static String insertAtRandom(String str, String toInsert) {
        int n = str.length();
        int r = (int)((n+1)*Math.random());
        return str.substring(0,r) + toInsert + str.substring(r);
    }
}
/**
 This code only generate password included 1 number and 1 punctuation
 */