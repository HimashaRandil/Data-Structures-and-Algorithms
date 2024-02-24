
class QueueArray
{
    // variables 
    private int [] queueArray;
    private int nELem;
    private int front;
    private int rear;
    private int maxSize;

    // constructor 
    public QueueArray(int max)
    {
        maxSize = max;
        queueArray = new int[maxSize];
        nELem = 0;
        front = 0;
        rear = -1;
    }

    // methods

    public boolean isFull()
    {
        return (nELem == maxSize);
    }

    //insert 

    public void insert(int value)
    {   // Simple Queue or Linear Queue 
        if(!isFull())
        {
            
            rear= rear+1;
            System.out.println("Inserting : " + value);
            queueArray[rear]= value;
            nELem++;
        }
        else
        {
            System.out.println("The Queue is Full!\n Cant Insert!");
        }
    }

    public boolean isEmpty()
    {
        return (nELem == 0);
    }

    public int remove()
    {
        int temp;
        if(isEmpty())
        {
            System.out.println("Cant Remove!\nQueue is Empty!");
            return 0;
        
        } 
        else
        {
            temp = queueArray[front];//9
            front = front +1; 
            nELem = nELem -1; 
            return temp;
        }  
    }

    public int peek()
    {
        return queueArray[front];
    }

    public int Size()
    {
        return nELem;
    }

    public void printQueue()
    {
        System.out.println("====== Queue =====");
        for(int i=front; i<=rear; i++)
        {
            System.out.print(queueArray[i]+ " ");
        }
        System.out.println("\n");
    }

    
}




public class App 
{
    public static void main(String[] args) throws Exception 
    {
        QueueArray Q1 = new QueueArray(8);
        Q1.insert(12);
        Q1.insert(23);
        Q1.insert(34);
        Q1.insert(45);
        Q1.insert(56);
        Q1.insert(67);
        Q1.insert(98);
        Q1.insert(86);
        Q1.insert(46);

        Q1.printQueue();

        Q1.remove();
        Q1.printQueue();
        System.out.println("Front Element is : " + Q1.peek());
        Q1.printQueue();

    }
}
