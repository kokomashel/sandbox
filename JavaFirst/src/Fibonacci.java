/**
 * Created on 9/22/17.
 * Write fibonacci iteratively and recursively (bonus: use dynamic programming)
 */
public class Fibonacci {

    public static void main (String[] args)
    {
        int numOfIterations = 23;
        printFibbonaciIteratively(numOfIterations);
        printFibonacciRecursively(0, 1, 23);
    }

    private static void printFibbonaciIteratively(int iterationsNum)
    {
        int fibonacciPrev = 0;
        int fibonacciCur = 1;
        int fibonacciNext;
        int i;

        for (i = 0; i < iterationsNum; i++)
        {
            System.out.println(fibonacciCur);
            fibonacciNext = fibonacciPrev + fibonacciCur;
            fibonacciPrev = fibonacciCur;
            fibonacciCur = fibonacciNext;
        }
    }

    private static void printFibonacciRecursively(int fibonacciPrev, int fibonacciCur, int iterationNum)
    {
        int fibonacciNext;
        if(iterationNum == 0)
        {
            System.out.println("Done!");
            return;
        }

        fibonacciNext = fibonacciPrev + fibonacciCur;
        System.out.println(fibonacciNext);
        printFibonacciRecursively(fibonacciCur, fibonacciNext, --iterationNum);

    }

}
