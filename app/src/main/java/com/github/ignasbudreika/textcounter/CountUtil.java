package com.github.ignasbudreika.textcounter;

public class CountUtil {

    private CountUtil() {}

    public static int count(String text, boolean words) {
        if (text == null || text.length() == 0) {
            return 0;
        }

        if (words) {
            return countWords(text);
        } else {
            return countCharacters(text);
        }
    }

    private static int countWords(String text) {
        return text.split("(\\s|,|\\.|-|:|!|\\?|;|\\(|\\)|\")+").length;
    }

    private static int countCharacters(String text) {
        return text.length();
    }
}
