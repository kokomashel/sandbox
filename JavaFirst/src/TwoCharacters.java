/**
 * Created on 11/10/17.
 * https://www.hackerrank.com/challenges/two-characters/problem
 * Given , convert it to the longest possible string .
 * Then print the length of string  on a new line;
 * if no string  can be formed from , print  instead.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        int[] alpha = new int[26];

        int size = s.split("").length;

        for(int i = 0; i < size; i++){
            alpha[s.charAt(i) - 'a']++;
        }

        int a = 0; //0 - start, 1 - i; 2 - j
        int maxstring = 0;
        int curstring = 0;

        for(int i = 0; i < 26; i++){
            if(alpha[i] > 0){
                for(int j = 0; j < 26; j++){
                    if(alpha[j] > 0 & (i != j) & (alpha[j] <= alpha[i] + 1) && (alpha[j] >= alpha[i] - 1)){
                        //System.out.println(alpha[j] + " " + alpha[i]);
                        for(int x = 0; x < size; x++){
                            if(s.charAt(x) == 'a' + i || s.charAt(x) == 'a' + j){
                                //System.out.println(s.charAt(x));
                                if(a == 0){
                                    a = (s.charAt(x) == 'a' + i ? 1 : 2);
                                    curstring++;
                                }
                                else if(a == 1) {
                                    if(s.charAt(x) == 'a' + i) {
                                        curstring = 0;
                                        a = 0;
                                        break;
                                    }
                                    else {
                                        a = 2;
                                        curstring++;
                                    }
                                }
                                else {
                                    if (s.charAt(x) == 'a' + j) {
                                        curstring = 0;
                                        a = 0;
                                        break;
                                    }
                                    else {
                                        a = 1;
                                        curstring++;
                                    }
                                }
                            }
                        }
                        //System.out.println(curstring);
                        maxstring = (maxstring < curstring ? curstring : maxstring);
                        curstring = 0;
                        a = 0;
                    }
                }
            }
        }
        maxstring = (maxstring > 1 ? maxstring : 0);
        System.out.println(maxstring);
    }
}
