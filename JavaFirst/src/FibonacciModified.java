/**
 * Created on 11/15/17.
 * https://www.hackerrank.com/challenges/fibonacci-modified/problem
 * Given three integers compute and print term n of a modified Fibonacci sequence.
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FibonacciModified {

    public static void main(String args[] ) throws Exception {

        Scanner in = new Scanner(System.in);
        int t0 = in.nextInt();
        int t1 = in.nextInt();
        int n = in.nextInt();

        System.out.println(fibMod(t0, t1, n).toString());
    }

    private static BigInteger fibMod(int t0, int t1, int n){

        BigInteger tPrev = BigInteger.valueOf(t0);
        BigInteger tCur = BigInteger.valueOf(t1);
        BigInteger tmp;

        if(n == 1)
            return BigInteger.valueOf(t0);
        if(n == 2)
            return BigInteger.valueOf(t1);

        for(int i = 3; i <=n; i++){
            tmp = tCur;
            tCur = tCur.pow(2);
            tCur = tCur.add(tPrev);
            tPrev = tmp;
            //System.out.println(i + " " + tCur.toString());
        }

        return tCur;
    }
}
