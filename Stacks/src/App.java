import java.util.Scanner;
class StackArray
{
    private int maxsize; //size of the stack array
    private char [] stackData;
    private int top;

    //----------------------------------------------------------

    public StackArray(int s)
    {
        //Construcctor
        maxsize = s;
        stackData = new char [maxsize];
        
        top = -1;
    }

    public void push(char j)
    {
        //put item on top of stack
        if (isFull()) 
        {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }
      
          System.out.println("Inserting " + j);
          stackData[++top] = j;
    }

    public char pop()
    {
        //take item from top of stack
        if (isEmpty()) 
        {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
         
        return stackData[top--];  

    }

    public char peak()
    {
        //peak at top of stack
        return stackData[top];
    }

    public boolean isEmpty()
    {
        //true if stack is empty
        return top == -1;

    }

    public void printStack() 
    {
        //print the stack 
        for (int i = 0; i <= top; i++) 
        {
          System.out.print(stackData[i] +  "  ");
        }
        System.out.println("");
    }

    public boolean isFull()
    {
        //check if the stack is full
        return top == maxsize - 1;
    }


}







public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner in = new Scanner(System.in);

        String str;

        System.out.println("Enter A Word : ");
        str = in.nextLine();

        char[] ch = new char[str.length()];
  
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
  
        int size = ch.length;
        StackArray stack = new StackArray(size);

    
        for(int i = 0; i < size; ++i) 
        {
            stack.push(ch[i]);
        }

        System.out.println("Reversed Word is : ");

        for(int i = 0; i < size; ++i) 
        {
            System.out.print(stack.pop());
        }

         


    }
}
