/**
 * Created on 9/29/17.
 * Consider an array of  integers, , where all but one of the integers occur in pairs.
 * In other words, every element in  occurs exactly twice except for one unique element.
 * Given , find and print the unique element.
 */

import java.util.Scanner;

public class LonelyIntXor {

    public static int lonelyInteger(int[] a)
    {
        int size = a.length;
        int i;
        int lonelyInt = 0;

        for(i = 0; i < size; i++)
        {
            lonelyInt ^= a[i];
        }

        return lonelyInt;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }

        System.out.println(lonelyInteger(a));

    }
}
