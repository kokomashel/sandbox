import java.util.Arrays;
import java.util.*;

/**
 * Created by yc04127 on 9/18/17.
 */
public class SumEqual {

    public static void main(String[] args)
    {
        ArrayList<Integer> randList = new ArrayList<Integer> (Arrays.asList(2, 3, 5, 6, 7, 3, 45, 67, 2, 4, 9, 1, 0, 10, -2, 12));
        int i;
        int j;

        for(i = 0; i < randList.size(); i++)
        {
            j = randList.indexOf(10 - randList.get(i));
            if((j != -1) && (i != j))
            {
                System.out.println("Element " + i + " and element " + j + ": " + randList.get(i) + " + " + randList.get(j));
            }
        }
    }
}
