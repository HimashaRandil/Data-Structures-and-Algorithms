
class BubbleSort
{
    // variables
    private int [] Array;
    private int nElements;

    // methods 

    public BubbleSort(int size)
    {
        Array = new int[size];
        nElements = 0;
    }

    //insert method
    public void insert(int value)
    {
        if(nElements == Array.length)
        {
            System.out.println("Array is Full!");
            return;
        }
        else
        {
            Array[nElements]=value;
            nElements=nElements+1;
        }
    }

    //display method
    public void display()
    {
       // System.out.println("=====Array=====");
        for(int i=0; i<nElements; i++)
        {
            System.out.print(Array[i] + " ");
        }
        System.out.println("\n");
    }


    //swap methods
    public void swap(int one, int two)
    {
        int temp = Array[one];
        Array[one]=Array[two];
        Array[two]=temp;
    }

    public void BubbleSortAlgorithem()
    {
        int k = nElements;
        for(int i=0; i<k-1; i++)
        {
            boolean swaped = false;
            for(int j=0; j <k-1-i; j++)
            {
                if(Array[j]>Array[j+1])
                {
                    swap(j, j+1);
                    swaped = true;
                }

            }
            if(!swaped)
            {
                break;
            }

        }
    }
}


public class App 
{
    public static void main(String[] args) throws Exception 
    {
       int maxSize = 25;
       BubbleSort A1 = new BubbleSort(maxSize);
       for(int j=0; j<maxSize; j++)
        {

            int n= (int)(java.lang.Math.random()*(maxSize-1));
            A1.insert(n);
        }

        System.out.println("===================Unsorted Array=================== ");
        A1.display();
        A1.BubbleSortAlgorithem();
        System.out.println("====================Sorted Array==================== ");
        A1.display();
    }
}
