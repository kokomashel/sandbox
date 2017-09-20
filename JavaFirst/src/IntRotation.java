import java.util.*;
import java.util.Arrays;

/**
 * Created 9/20/17
 * Given 2 integer arrays, determine of the 2nd array is a rotated version of the 1st array.
 * Ex. Original Array A={1,2,3,5,6,7,8} Rotated Array B={5,6,7,8,1,2,3}
 */
public class IntRotation {

    private static ArrayList<Integer>  arrayInit = new ArrayList<Integer> (Arrays.asList(1,2,3,5,6,7,8));
    private static ArrayList<Integer>  arrayToCheck = new ArrayList<Integer> (Arrays.asList(5,6,7,8,1,2,3));

    public static void main(String[] args)
    {
        int i = 0;
        int tmpIndex;
        boolean rotatedVersion = true;

        do {
            tmpIndex = arrayToCheck.indexOf(arrayInit.get(i));

            if (tmpIndex > -1) {
                while ((i < arrayInit.size()) &&
                        (tmpIndex < arrayToCheck.size()) &&
                        (arrayInit.get(i) == arrayToCheck.get(tmpIndex))) {
                    i++;
                    tmpIndex++;
                }
            }
            else
            {
                System.out.println("No! ArrayToCheck is not a rotated version of ArayInit");
                rotatedVersion = false;
                break;
            }
        }
        while (i < arrayInit.size());

        if(rotatedVersion)
        {
            System.out.println("Yes! ArrayToCheck is a rotated version of ArayInit");
        }

    }
}
