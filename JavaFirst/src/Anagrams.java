/**
 * Created on 9/27/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagrams {

    public static int numberNeeded(String first, String second) {

        int i, sum = 0;
        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();

        int[] alphabet = new int[26];

        for(i = 0; i < firstCharArray.length; i++)
            alphabet[firstCharArray[i] - 'a']++;

        for(i = 0; i < secondCharArray.length; i++)
            alphabet[secondCharArray[i] - 'a']--;

        for(i = 0; i < 26; i++)
            sum += Math.abs(alphabet[i]);

        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
