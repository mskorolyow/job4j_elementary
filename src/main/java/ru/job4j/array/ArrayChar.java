package ru.job4j.array;

public class ArrayChar {

    /** @noinspection checkstyle:InnerAssignment*/
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int i = 0; i < prefix.length; i++) {
            if (word[i] != prefix[i]) {
                result = false;
                break;
            }

        }
        return result;
    }
}
