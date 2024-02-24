import java.util.LinkedList;

class Node 
{
    
    //variables    
        public int item;
        public Node next;
        
    //constructor    
        public Node(int item)
        {
            this.item=item;
            next=null;
        }
        
    //methods    
        public void displayNode()
        {
            System.out.print(item +  " ");
        } 
}


class LinkList 
{

    //variables    
        public Node head;
        
    //constructer    
        public LinkList()
        {
            head=null;
        }
        
    //methods    
        public boolean isEmpty()
        {
            return (head==null);
        }
        
        public void insertFirst(int item)
        {
            Node newNode = new Node(item);
            
            newNode.next=head;
            head=newNode;   
        }

        public void insertAtEnd(int item)
        {
            /* 1. Allocate the Node &
               2. Put in the data
               3. Set next as null */
            Node new_node = new Node(item);
         
            /* 4. If the Linked List is empty, then make the
                   new node as head */
            if (head == null)
            {
                head = new Node(item);
                return;
            }
         
            /* 4. This new node is going to be the last node, so
                 make next of it as null */
            new_node.next = null;
         
            /* 5. Else traverse till the last node */
            Node last = head;
            while (last.next != null)
                last = last.next;
         
            /* 6. Change the next of last node */
            last.next = new_node;
            return;
        }
        
        
        public Node deleteFirst()
        {
            if(!isEmpty())
            {
                Node temp=head;
                head=head.next;
    
                return temp;
            }
            else
                return null;
        }
        
        public void printList()
        {
            Node current=head;
            System.out.println("\t~~~~~~~ LIST ~~~~~~~\n");
            while(current!=null)
            {
                current.displayNode();
                current=current.next;
            }
        }
        
        public Node find(int key)
        {
            Node current= head;
            
            
            while(current.next!=null)
            {
                if(current.item==key)
                    {
                        break;
                    }
                else
                    current=current.next;
            }
            
            if(current.item==key)
            {
                System.out.println("Item is found");
                return current;
            }
                
            else{
                System.out.println("Item is not found");
                return null;
            }
                
            
        }
        
        public void delete(int key) {
            
            Node prevNode = null;
            Node currNode = head;
    
            while (currNode != null && currNode.item != key) {
                prevNode = currNode;
                currNode = currNode.next;
            }
            if (currNode == head){
                head = head.next;
                System.out.println("Head node deleted");
            }
            else
            {
                if (currNode == null) {
                    System.out.println("A node with that value does not exist.");
                }
                else {
                   System.out.println("A node with the value " +  currNode.item + " deleted");
                   prevNode.next = currNode.next;
                    
                }
            }
    
        }


        // merge
        void merge(LinkList y)
    {
        Node x_curr = head, y_curr = y.head;
        Node x_next, y_next;
 
       
        while (x_curr != null &&
               y_curr != null)
        {
          
            x_next = x_curr.next;
            y_next = y_curr.next;
 
            y_curr.next = x_next;
 
            x_curr.next = y_curr;
 
            
            x_curr = x_next;
            y_curr = y_next;
        }
        y.head = y_curr;
    }
    
        
}




public class App {
    
    public static void main(String[] args) 
    {
        
       LinkList L1 = new LinkList();
       LinkList L2 = new LinkList();

       L1.insertFirst(12);
       L1.insertAtEnd(25);
       L1.insertAtEnd(17);
       L1.insertAtEnd(10);
       L1.insertAtEnd(20);

       System.out.println("\n\n============== The Entered First List ==============\n");
       L1.printList();


       L2.insertFirst(8);
       L2.insertAtEnd(14);
       L2.insertAtEnd(2);
       L2.insertAtEnd(24);
       L2.insertAtEnd(6);

       System.out.println("\n\n============== The Entered Second List ==============\n");
       L2.printList();


       L1.merge(L2);

       System.out.println("\n\n============== The New First List ==============\n");
       L1.printList();

       System.out.println("\n\n============== The New Second List ==============\n");
       L2.printList();


        
    }
}