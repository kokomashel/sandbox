/**
 * Created on 11/27/17.
 * https://www.hackerrank.com/challenges/sum-vs-xor/problem
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumVsXOR {

    static long solveBF(long n) {

        int count = 0;
        for(int i = 0; i <= n; i++){
            if((n + i) == (n^i))
                count++;
        }
        return count;
    }

    static long solve(long n) {

        int count = 0;

        while(n > 0){
            if(n%2 == 0)
                count++;
            n /= 2;
        }
        return (long) Math.pow(2, count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }
}
