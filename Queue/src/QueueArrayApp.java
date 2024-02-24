class QueueArray 
{
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    //constructor
    public QueueArray()
    {
        
        front = -1;
        rear = -1;
          
    }
    public QueueArray(int max)
    {
        maxSize=max;
        queueArray = new int[max];
        front=0;
        rear=-1;
        nItems=0;

        
    }

    boolean isFull() 
    {
        if (front == 0 && rear == maxSize - 1) 
        {
            return true;
        }
            return false;
    }
        
          // check if the queue is empty
    boolean isEmpty() 
    {
        if (front == -1)
          return true;
        else
          return false;
    }

    void display() 
    {
        int i;
        if (isEmpty()) 
        {
             System.out.println("Empty Queue");
        }
        else 
        {
            // display the front of the queue
            System.out.println("\nFront index-> " + front);
        
            // display element of the queue
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(queueArray[i] + "  ");
        
            // display the rear of the queue
             System.out.println("\nRear index-> " + rear);
        }
    }

    void Insert(int element) 
    {

        // if queue is full
        if (isFull()) 
        {
          System.out.println("Queue is full");
        }
        else 
        {
          if (front == -1) 
          {
            // mark front denote first element of queue
            front = 0;
          }
    
          rear++;
          // insert element at the rear
          queueArray[rear] = element;
          System.out.println("Insert " + element);
        }
    }

    int Remove() 
    {
        int element;
    
        // if queue is empty
        if (isEmpty()) 
        {
          System.out.println("Queue is empty");
          return (-1);
        }
        else 
        {
          // remove element from the front of queue
          element = queueArray[front];
    
          // if the queue has only one element
          if (front >= rear) 
          {
            front = -1;
            rear = -1;
          }
          else 
          {
            // mark next element as the front
            front++;
          }
          System.out.println( element + " Deleted");
          return (element);
        }
      }
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return queueArray[front];
    }

}


public class QueueArrayApp
{
  public static void main(String[] args) throws Exception 
    {
        // create an object of Queue class
    QueueArray q = new QueueArray(6);

    // try to delete element from the queue
    // currently queue is empty
    // so deletion is not possible
    q.Remove();

    // insert elements to the queue
    for(int i = 1; i < 6; i ++) 
    {
      q.Insert(i);
    }

    // 6th element can't be added to queue because queue is full
    q.Insert(6);

    q.display();

    // deQueue removes element entered first i.e. 1
    q.Remove();

    // Now we have just 4 elements
    q.display();
    }
}