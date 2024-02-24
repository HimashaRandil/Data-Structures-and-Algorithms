import java.util.Currency;

class Node
{
    public int data;
    public Node next;

    //constructor
    public Node(int value)
    {
        data = value;
        next = null;
    }

    public void display()
    {
        System.out.print(data);
    }
}

class LinkedList
{
    // variables
    public Node head;
    public Node tail;

    // constructor
    public LinkedList(int val)
    {
        head = null;
    }

    // methods
    public boolean isEmpty()
    {
        return (head == null);
    }

    //insert at the beginging
    public void insertFirst(int val)
    {
        Node newnode = new Node(val);

        newnode.next = head;
        head = newnode;
    }

    public void insertEnd(int val)
    {
        Node newnode = new Node(val);

        if(isEmpty())
        {
            head = newnode;
         // tail = newnode;
        }

        newnode.next = null;

        // tail.next = newnode; // uncomment if tail variable is present 
        // tail = newnode;

        Node temp = head;// Run this if tail variable is absent 
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newnode; // Till hear
        return;
    }

    public void delete(int key)
    {
        Node prevNode = null;
        Node currNode = head;

        while(currNode != null && currNode.data != key)
        {
            prevNode = currNode;
            currNode = currNode.next;
        }
        if(currNode == head)
        { 
            head = head.next;
            System.out.println("Head Node is Deleted");
        }
        else 
        {
            if(currNode == null)
            {
                System.out.println("A Node with value does not exist");
            }
            else
            {
                System.out.println("A node with the value " +  currNode.data + " deleted");
                prevNode.next = currNode.next;

            }
        }
    }
}





public class App 
{
    public static void main(String[] args) throws Exception 
    {
        
    }
}
