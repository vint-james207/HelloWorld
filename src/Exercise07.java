/**
 * Created by jamesyburr on 6/28/16.
 */
public class Exercise07 {

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome("hello"));

        //date range: 01/01/2016 to 12/31/2016
        // MDDYY 6106 06/10/2016
    }

    //found on stackoverflow, Andrew Mao
    public  static boolean isPalindrome(String input) {
        int num = input.length();
        for (int i = 0; i < num/2; i++)
            if (input.charAt(i) != input.charAt(num-i-1)) return true;
        return false;
    }
}
