import java.util.*;
import java.util.Scanner;
public class App
{
    public static void main(String args[])
    {
        // creating a stack 
        StackArray stack = new StackArray(1000);
        Scanner in = new Scanner(System.in);
        int num = 0;
    
        System.out.println("Enter a decimal number: ");
        num = in.nextInt();
        
    
        while(num>0)
        {
            int remainder = num%2;
            stack.push(remainder);
            num=num/2;
        }
    
        System.out.print("Binary equivalent: ");
    
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());
        }
    }
}

class StackArray
{
    private int maxsize; //size of the stack array
    private int [] stackData;
    private int top;

    //----------------------------------------------------------

    public StackArray(int s)
    {
        //Construcctor
        maxsize = s;
        stackData = new int[maxsize];
        top = -1;
    }

    public void push(int j)
    {
          stackData[++top] = j;
    }

    public int pop()
    {
        //take item from top of stack
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
          }
          return stackData[top--];  

    }

    public boolean isEmpty()
    {
        //true if stack is empty
        return top == -1;

    }

}




