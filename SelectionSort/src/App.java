import javax.xml.stream.events.EndElement;

class SelectionSort
{
    private int[] bArray;
    private int nElements;    

    // constructor
    public SelectionSort(int max)
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

    // interchange by swapping

    public void swap(int one, int two)
    {
        int temp = bArray[one];
        bArray[one] = bArray[two];
        bArray[two] = temp;
    }

    // Bubble Sort

    public void SelectionSort()
    {
        int min;
            for(int step=0; step<nElements-1; step++)
            {
                min = 0;
                for(int i=step+1; i<nElements; i++)
                {
                    if(bArray[i]<bArray[min])
                    {
                        min=i;
                    }
                }
                swap(min,step);
            }
            
        

    }


}

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int maxSize = 100; 
        SelectionSort NewArray = new SelectionSort(maxSize);

        for(int j=0; j<maxSize; j++)
        {

            int n= (int)(java.lang.Math.random()*(maxSize-1));
            NewArray.insert(n);
        }
        
        System.out.println("----------------Unsorted Array----------------");
        NewArray.display();

        NewArray.SelectionSort();

        System.out.println("\n-----------------Sorted Array-----------------");
        NewArray.display();

        
    }
}
