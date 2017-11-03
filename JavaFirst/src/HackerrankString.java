/**
 * Created on 11/3/17.
 * https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
 * You must answer  queries, where each query consists of a string, .
 * For each query, print YES on a new line if contains hackerrank; otherwise, print NO instead.
 *
 */

import java.util.Scanner;

public class HackerrankString {

    static String[] hr = new String[] {"h","a","c","k","e","r","r","a","n","k"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            System.out.println(ifHackerrank(s));
        }
    }

    private static String ifHackerrank(String s) {

        String[] string = s.split("");
        int size = string.length;
        int hrSize = hr.length;
        int j = 0;

        for(int i = 0; i < size; i++){
            if(string[i].equals(hr[j]))
                j++;
            if(j == hrSize)
                return "YES";
        }
        return "NO";
    }
}
