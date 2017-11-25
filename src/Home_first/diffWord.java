package Home_first;

/**
 * Created by Viktoriia_Sherstiuk on 6/16/2017.
 */
public class diffWord {
    public static int diffWords(String arr) {
        char[] wordChars = arr.toCharArray();
        int result = 0;
        for (int i = 1; i < wordChars.length; i++) {
            if (wordChars[0] != wordChars[i]) {
                result++;
            }
        }
        return result;
    }
}

