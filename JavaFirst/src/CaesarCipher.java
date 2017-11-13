/**
 * Created on 11/13/17.
 * https://www.hackerrank.com/challenges/caesar-cipher-1/problem
 * Given a string and a number, encrypt  and print the resulting string.
 */

import java.io.*;
import java.util.*;

public class CaesarCipher {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int K = in.nextInt();
        char[] ar = s.toCharArray();
        char[] dec = new char[size];
        int k = K%26;


        for(int i = 0; i < size; i++){
            if(ar[i] >= 'a' && ar[i] <= 'z')
                dec[i] = (char) (ar[i] + k <= 'z' ? ar[i] + k : 'a' + (k - ('z' - ar[i]) - 1));
            else if(ar[i] >= 'A' && ar[i] <= 'Z')
                dec[i] = (char) (ar[i] + k <= 'Z' ? ar[i] + k : 'A' + (k - ('Z' - ar[i]) - 1));
            else
                dec[i] = ar[i];
        }

        System.out.println(String.valueOf(dec));

        return;
    }
}
