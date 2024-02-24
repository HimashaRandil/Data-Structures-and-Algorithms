class Insertionsort
    {
        private int[] bArray;
        private int nElements;    

    // constructor
    public Insertionsort(int max)
    {
        bArray = new int[max];
        nElements = 0; 
        
    }

    //insert

    public void insert(int val)
    {
        if(nElements==bArray.length)
        {
            System.out.println("Array is Full!!");
        }
        else 
        {
            bArray[nElements]=val; //nElements like index of your array 0,1,2,...
            nElements++;
        }
    }

    // Display

    public void display()
    {
        
        for(int i=0; i<nElements; i++)
        {
            System.out.print(bArray[i] + "  ");
        }

    }
    

    void sort()
    {
        int n = bArray.length;
        for (int i = 1; i < n; ++i) 
        {
            int key = bArray[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && bArray[j] > key) 
            {
                bArray[j + 1] = bArray[j];
                j = j - 1;
            }
            bArray[j + 1] = key;
        }
    }

    }
public class App
{
    public static void main(String[] args) throws Exception 
    {
        int maxSize = 10; 
        Insertionsort NewArray = new Insertionsort(maxSize);

       // for(int j=0; j<maxSize; j++)
        {

           // int n= (int)(java.lang.Math.random()*(maxSize-1));
            NewArray.insert(n);
        }
        NewArray.insert(4);
        NewArray.insert(75);
        NewArray.insert(6);
        NewArray.insert(32);
        NewArray.insert(55);
        NewArray.insert(26);
        NewArray.insert(41);
        NewArray.insert(15);
        
        System.out.println("----------------Unsorted Array----------------");
        NewArray.display();

        NewArray.Sort();

        System.out.println("\n-----------------Sorted Array-----------------");
        NewArray.display();
    }
}

