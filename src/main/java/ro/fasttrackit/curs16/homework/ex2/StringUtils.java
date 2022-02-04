package ro.fasttrackit.curs16.homework.ex2;

public class StringUtils {
    public static String ensureNotEmpty (String word) throws IllegalArgumentException {
        if (word == null || "".equals(word.trim())) {
            throw new IllegalArgumentException("No null/empty value accepted!");
        } else {
            return word;
        }
    }
    public static int validPrice (int price) {
        return Math.max(price, 0);
    }
}
