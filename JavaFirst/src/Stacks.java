/**
 * Created on 10/2/17.
 * Given  strings of brackets, determine whether each sequence of brackets is balanced.
 * If a string is balanced, print YES on a new line; otherwise, print NO on a new line.
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stacks {

    public static class Node{
        private char element;
        private Node next;
        private Node(char data)
        {
            element = data;
        }
    }

    public static Node top;

    public static boolean isBalanced(String expression) {
        char[] array = expression.toCharArray();
        char b;
        top = null;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == '[' || array[i] == '(' || array[i] == '{')
            {
                push(array[i]);
            }
            else
            {
                if(!isEmpty())
                    b = pop();
                else
                    return false;

                switch(array[i]) {
                    case ')':
                        if(b != '(')
                            return false;
                        break;
                    case '}':
                        if(b != '{')
                            return false;
                        break;
                    case ']':
                        if(b != '[')
                            return false;
                        break;
                    default:
                        break;
                }
            }
        }
        if(!isEmpty())
            return false;

        return true;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }

    public static void push(char a)
    {
        Node node = new Node(a);
        if(isEmpty())
            node.next = null;
        else
            node.next = top;
        top = node;
    }

    public char get()
    {
        return top.element;
    }

    public static boolean isEmpty()
    {
        return top == null;
    }

    public static char pop()
    {
        char a = top.element;
        top = top.next;
        return a;
    }

}
