import java.util.Scanner;
class StackArr
{
    // variables 
    private int maxsize; 
    private int [] StackArray; 
    private int top; 


    // methods

    public StackArr(int n)
    {
        maxsize = n;
        StackArray = new int[maxsize];
        top = -1;
    }

    public boolean isFull()
    {
        return top == (maxsize-1); // If correct return true
    }

    public void push(int ele)
    {
        if(isFull())
        {
            System.out.println("Overflow! Stack is Full\nProgram Terminated ");
            System.exit(1);
        }
        else 
        {
            System.out.println("Inserting : "+ ele);
            StackArray[++top] = ele;     
        }
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public int pop()
    {

        if(isEmpty())
        {
            System.out.println("Stack Is Empty");
            System.exit(1);
        }

        return StackArray[top--];
        
    }

    public int peek()
    {
        return StackArray[top]; 
    }

    public void printStack()
    {
        for(int i=0; i<=top; i++)
        {
            System.out.print(StackArray[i] + " ");
        }
    }

    
}




public class App 
{
    public static void main(String[] args) throws Exception 
    {   
        StackArr S1 = new StackArr(7);
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter a value");
        S1.push(23);
        S1.push(13);
        S1.push(34);
        S1.push(67);
        S1.push(98);
        S1.push(17);
        S1.push(45);
        
        System.out.println(S1.pop());
        S1.printStack();
        System.out.println(S1.peek());
        S1.printStack();
        System.out.println(S1.peek());
        S1.printStack();

    }
}


