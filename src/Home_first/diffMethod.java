package Home_first;

/**
 * Created by Viktoriia_Sherstiuk on 6/24/2017.
 */
public class diffMethod {
    public static int evenDigit(String oddnum) {
        char[] wordChars = oddnum.toCharArray();
        String evendigit = "";
        for (int i = 0; i < wordChars.length; i++) {
            if (wordChars[i] % 2 != 0) {
                evendigit += " " + wordChars[i];
            }
        }
        int a = evendigit.length();
        return a;
    }

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
    public static boolean allDiffWords(String arr) {
        char[] wordChars = arr.toCharArray();
        int result = 0;
        for (int i = wordChars.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (wordChars[i] == wordChars[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public  static int oddDigit(String oddnum) {
        char[] wordChars = oddnum.toCharArray();
        String odddigit = "";
        for (int i = 0; i < wordChars.length; i++) {
            if (wordChars[i] % 2 == 0) {
                odddigit += " " + wordChars[i];
            }
        }
        int a = odddigit.length();
        return a;
    }
}



