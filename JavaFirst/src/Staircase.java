/**
 * Created on 10/16/17.
 * Given the respective heights for each of the  staircases in his house,
 * find and print the number of ways he can climb each staircase on a new line.
 */

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(waysNum(n));
        }
    }

    public static int waysNum(int n)
    {
        int waysPrev;
        int waysPrevPrev;
        int waysCur;
        int prob = 0;

        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        if( n == 2)
            return 2;
        if(n == 3)
            return 4;

        //return (waysNum(n - 1) + waysNum(n - 2) + waysNum(n - 3));

        waysPrevPrev = 1;
        waysPrev = 2;
        waysCur = 4;


        for(int i = 4; i <= n; i++)
        {
            prob = waysPrevPrev + waysPrev + waysCur;
            waysPrevPrev = waysPrev;
            waysPrev = waysCur;
            waysCur = prob;
        }

        return prob;
    }
}
