/**
 * Created on 10/16/17.
 * A prime is a natural number greater than  that has no positive
 * divisors other than  and itself. Given  integers,
 * determine the primality of each integer and print whether
 * it is Prime or Not prime on a new line.
 */

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Primality {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            if(ifPrime(n))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }

    public static boolean ifPrime(int n)
    {
        int square = (int) Math.sqrt(n) + 1;

        if(n == 2)
            return true;

        if(n%2 == 0)
            return false;

        for(int i = 3; i <= square; i += 2)
        {
            if(n%i == 0)
                return false;
        }

        if(square%2 == 0)
            if(n%(square - 1) == 0)
                return false;

        return true;
    }

}