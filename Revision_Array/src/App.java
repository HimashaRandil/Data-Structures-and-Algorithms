import org.w3c.dom.Attr;

class Array
{
    // variaables 
    private int [] Array;
    private int nElem;

    //constructor 
    public Array(int size)
    {   
        Array = new int[size];
        nElem=0;
    }

    // methods
    public void insert(int num)
    {
        boolean found = false;
        
        for(int i=0; i<nElem; i++)
        {
            if(Array[i] == num)
            {
                System.out.println("The Element is Already in the Array");
                found = true;
                break;
            }
        }

        if(found == false)
        {
            if(Array.length==nElem)
            {
            System.out.println("The Array is Full");
            return;
            } 

            System.out.println("Inserting : " + num);
            Array[nElem] = num;
            nElem++;
        }
    }

    public void display()
    {
        System.out.println("======= Array Elements =======\n\n");
        for (int i =0; i<nElem; i++)
        {
            System.out.print(Array[i]+ " ");
        }
        System.out.print("\n");
    }

    public boolean find(int searchKey)
    {
        boolean found = false;
        for(int i =0; i<nElem; i++)
        {
            if(Array[i] == searchKey)
            {
                found=true;
                System.out.println("The Element Index Is : " + i);
                break;
            }
        }
        return found;
    }

    public boolean delete(int value )
    {
        boolean flag = false;
        for(int i=0; i<nElem; i++)
        {
            if(Array[i]==value)
            {
                flag = true;
                for(int j =i; j<nElem; j++)
                {
                    Array[j]=Array[j+1];
                }
                nElem--;
                System.out.println("The ELement "+ i+1 + "Is Deleted");
                break;
            }
        }

        if(flag == false)
        {
            System.out.println("The Element Not Found!");
        }
        return flag;
    }

}



public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Array A1 = new Array(10);

        A1.insert(12);
        A1.insert(65);
        A1.insert(34);
        A1.insert(98);
        A1.insert(56);
        A1.insert(78);
        A1.insert(32);
        A1.insert(54);

        A1.display();
        System.out.println(A1.find(23));
        A1.find(78);

        A1. delete(23);
        A1.delete(78);

        A1.display();

    }
}
