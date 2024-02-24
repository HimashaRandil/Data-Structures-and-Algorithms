import java.util.Scanner;
class Array
{
    // variables 
    private int [] array;
    private int nElem;
    


    // constructor 
    public Array(int max)
    {
        array = new int [max];
        nElem = 0;
    }

    // methods

    // insert 
    public void insert(int value)
    {
        if(array.length == nElem)
        {
            System.out.println("Array Is Full!");
            return;
        }
        
        //System.out.println("Inserting : " + value);
        array [nElem] = value;
        nElem++;
    }

    // display
    public void display()
    {
        System.out.println("====== Array Elements ======");
        System.out.println("\t");
        for(int i=0; i < nElem; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    //find
    public boolean find(int searchKey)
    {
        boolean found = false;
        for(int i=0; i < nElem; i++ )
        {
            if(array[i] == searchKey)
            {
                found=true;
                System.out.println("Index of the searched element is " + i);
                break;
                
            }
        }

        return found;
    }

    //delete
    public boolean delete(int value)
    {
        boolean flag = false;
        for(int i=0; i < nElem; i++)
        {
            if(array[i] == value)
            {
                for(int j=i; j < nElem; j++)
                {
                    array[j] = array[j+1]; 
                }
                nElem--;
                flag = true;
                System.out.println("Element " + (i+1) + " Is Deleted");
                break;
            }
        }
        if (flag == false)
        {
            System.out.println("Deleting Item Not Found!");
        }
        return flag;
    }

}



public class App
 {
    public static void main(String[] args) throws Exception 
    {
       

        Array a1 = new Array(10);
        
        a1.insert(12);
        a1.insert(34);
        a1.insert(14);
        a1.insert(56);
        a1.insert(42);
        a1.insert(22);
        a1.insert(55);

        a1.display();

        System.out.println(a1.find(21));

        a1.delete(33);


       
        
       

    }
}
