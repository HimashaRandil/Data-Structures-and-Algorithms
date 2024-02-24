import java.util.Stack;

class StackArray
{
    // variables
    private int [] StackArr;
    private int maxsize;
    private int top;

    // constructor 
    public StackArray(int size)
    {
        maxsize = size;
        StackArr = new int[maxsize];
        top = -1;
    }

    public boolean isFull()
    {
        return top == (maxsize-1);
    }

    public void push(int value)
    {
        if(isFull())
        {
            System.out.println("Overflow! The Stcak is Full.\nProgram Terminated!");
            System.exit(1);
        }
        System.out.println("Inserting " + value);
        StackArr[++top] = value;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("The Stack is Empty");
            System.exit(1);
        }

        return StackArr[top--];
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("The Stack is Empty");
            System.exit(1);
        }

        return StackArr[top];
    }

    public void printStack()
    {
        for(int i=0; i<=top; i++)
        {
            System.out.print(StackArr[i] + " ");
        }
    }
}




public class App 
{
    public static void main(String[] args) throws Exception 
    {
        StackArray S1 = new StackArray(10);

        S1.push(12);
        S1.push(76);
        S1.push(89);
        S1.push(23);
        S1.push(67);
       // S1.push(23);

        S1.printStack();
        System.out.println(S1.pop());
        S1.printStack();
        System.out.println(S1.peek());
        S1.printStack();
    }
}
