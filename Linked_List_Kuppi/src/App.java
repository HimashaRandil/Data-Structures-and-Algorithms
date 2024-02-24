import java.lang.reflect.Array;
import java.util.Scanner;

class Node
{
    // variable
    public int data;
    public Node next;

    // constructor
    public Node(int value)
    {
        data = value;
        next = null;   
    }

    // methods
    public void displayNode()
    {
        System.out.print(data);
    }
}

class LinkedList
{
    // variable
    private Node head;

    // constructor 
    public LinkedList()
    {
        head = null; // create an empty LinkedList
    }

    // methods
    public boolean isEmpty()
    {
        return (head == null);
    }

    // insert 
    // Insert at Begining
    public void insertAtFirst(int value)
    {
        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;
    }

    // Insert at end
    public void insertAtEnd(int value)
    {
        Node newnode = new Node(value);
        if(isEmpty())
        {
            head = newnode;

            return;
        } 
        newnode.next = null;

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newnode;
        return;
        
    }

    // Insert at middle 
    public void insertAtMiddle(int value)
    {

    }

    // Delete methode
    public void delete(int key)
    {
        Node prevNode = null;
        Node currNode = head;

        while(currNode!= null && currNode.data != key)
        {
            prevNode = currNode;
            currNode = currNode.next;
        }

        if( currNode == head)
        {
            head = head.next;
            System.out.println("Head is Deleted!");
        }
        else
        {
            if(currNode == null)
            {
                System.out.println("The entered value is not present in List");
            }
            else
            {
                System.out.println("A node with the value " +  currNode.data + " deleted");
                prevNode.next = currNode.next;
            }
        }
    }

    // display method
    public void display()
    {
        Node temp = head;
        System.out.println("===== Linked List =====");
        while (temp != null)
        {
            temp.displayNode();
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public Node find(int key)
    {
        Node current= head;
        
        
        while(current.next!=null)
        {
            if(current.data==key)
                {
                    break;
                }
            else
                current=current.next;
        }

        if(current.data == key)
        {
            return current;
        }
        else
        {
            System.out.println("Item Not found");
            return null;
        }
}




public class App 
{
    public static void main(String[] args) throws Exception 
    {
        LinkedList L1 = new LinkedList();
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Enter a decimal number: ");
        num = in.nextInt();

        while(num>0)
        {
            int remainder = num%2;
            L1.insertAtFirst(remainder);
            num=num/2;
        }

        L1.display();

       // L1.insertAtEnd(12);
       //  L1.insertAtEnd(23);
       // L1.insertAtEnd(76);
       // L1.insertAtEnd(46);

        
    }
}





public int median()
{
    int median;
    int size = Array.length();

    if(size%2 == 0)
    {
        median = Array[size/2];
    }
    else
    {
        median = (Array[(size-1)/2]+ Array[(size+1)/2])/2;
    }

    return median;
}