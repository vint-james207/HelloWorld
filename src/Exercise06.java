/**
 * Created by jamesyburr on 6/22/16.
 */
public class Exercise06 {

    public static void main(String[] args) {
        int num = 12345;
        //54321 emphasis on integer
        solvedViaLoop(num);
    }

    public static void solvedViaLoop(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        char[] reversedChars = new char[chars.length];



        int n = chars.length -1;
        for (char c : chars) {
            reversedChars[n] = c;
            n--;

        }

        int reversedNum = Integer.valueOf(String.valueOf(reversedChars));
        System.out.println(reversedNum);
    }

    public static void solveViaStringBuilder(int num) {
        StringBuilder s = new StringBuilder(String.valueOf(num));
        int reversedNum = Integer.valueOf(s.reverse().toString());
        System.out.println(reversedNum);
    }

    public static void solveViaMath(int num) {
        int reverseNum = 0;
        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }
        System.out.println(reverseNum);
    }

}

