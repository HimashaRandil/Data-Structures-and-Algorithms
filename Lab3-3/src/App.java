/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



class QueueArray 
{
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;
 
//constructor    
    public QueueArray(int max)
    {
        maxSize=max;
        queueArray = new int[max];
        front=0;
        rear=-1;
        nItems=0;
    }
    
//insert from rear    
    public void insert(int value)
    {
        if(!isFull())
        {
            if(rear==maxSize-1)//wrap around
                rear=-1;
            rear=rear+1;
            queueArray[rear]=value;
            nItems++;
            
            System.out.println(value+" inserted");
        }
        else
        {
            System.out.println("Queue is full. Can't insert !");
        }
    }

//delete from front    
    public int remove()
    {
        int temp;
        if(!isEmpty())
        {           
            temp=queueArray[front];
            front=front+1;
            if(front==maxSize)  // deal with wraparound
                front=0;
            
            
            nItems=nItems-1;
            
            return temp;
        }
        else
        {
            System.out.println("Queue is empty. Can't delete !");
            return 0;
        }
    }

//check if empty    
    public boolean isEmpty()
    {
        return (nItems == 0);
    }

//check if full      
    public boolean isFull()
    {
        return (nItems == maxSize);
    }
    
//Peek the front
    public int peek()
    {
        return (queueArray[front]);
    }
    
 // Number of items in queue   
    public int size() 
    {
        return nItems;
    }
}




  


public class App 
{
    public static void main(String[] args) throws Exception 
    {

        QueueArray newQueue = new QueueArray(8);
        int [] nQueue = new int[8];
        
        newQueue.insert(1);
        newQueue.insert(2);
        newQueue.insert(3);
        newQueue.insert(4);
        newQueue.insert(5);
        newQueue.insert(6);
        newQueue.insert(7);
        newQueue.insert(8);
        
        newQueue.insert(9);
        
        System.out.println("");
        
        for (int i=0;i<8 ; i++)
        {
            nQueue[i]= newQueue.remove();
        }
        
         int max =nQueue[0];
          for (int i=0; i<8; i++)
          {
              if(max<nQueue[i])
              {
                  max = nQueue[i];
              }
          }
          
           int min =nQueue[0];
          for (int i=0; i<8; i++)
          {
              if(min>nQueue[i])
              {
                  min = nQueue[i];
              }
          }
          
          System.out.println("Minimum Value: "+min);
          System.out.println("Maximum Value: "+max);
        
        //System.out.print(newQueue.remove()+" ");
        
        //System.out.println("");
        
       //newQueue.peek();
       
       //newQueue.size();
    }
}
