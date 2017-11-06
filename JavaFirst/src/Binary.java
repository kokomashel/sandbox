/**
 * Created by yc04127 on 11/6/17.
 */
import java.util.Scanner;

public class Binary {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = Integer.toString(n, 2);
        String[] ar = s.split("");
        int prev = 0, cur = 0;
        int size = ar.length;

        for(int i = 0; i < size; i++){
            if(ar[i].equals("1"))
                cur++;
            else {
                if(prev < cur)
                    prev = cur;
                cur = 0;
            }
        }
        //int res = (prev > cur ? prev : cur);
        System.out.println(prev > cur ? prev : cur);
    }
}
