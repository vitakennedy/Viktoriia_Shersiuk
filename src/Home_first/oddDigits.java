package Home_first;

/**
 * Created by Viktoriia_Sherstiuk on 6/24/2017.
 */
public class oddDigits {
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
