/**
 * Created by yc04127 on 10/13/17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QueueFromTwoStacks {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue <T> {

    Stack<Integer> a = new Stack<Integer>();
    Stack<Integer> b = new Stack<Integer>();

    public static <T> void MyQueue(){

    }

    public void enqueue(int n)
    {
        a.push(n);
    }

    public int dequeue()
    {
        if(b.empty())
            fillOldOnTop();
        return b.pop();
    }

    public int peek()
    {
        if(b.empty())
            fillOldOnTop();
        return b.peek();
    }

    public void fillOldOnTop()
    {
        while(!a.empty())
            b.push(a.pop());

    }
}
