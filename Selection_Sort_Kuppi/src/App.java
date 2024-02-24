
class SelectionSort
{
    // variables 
    private int [] Array;
    private int nElem;

    // constructor 
    public SelectionSort(int size)
    {
        Array = new int[size];
        nElem=0;
    }

    // insert method
    public void insert(int value)
    {
        if(nElem ==Array.length)
        {
            System.out.println("Array Is Full!\nCan't insert elements");
        }
        else
        {
            Array[nElem]=value;
            nElem=nElem+1;
        }
    }

    //display method
    public void display()
    {
        for(int i =0; i<nElem; i++)
        {
            System.out.print(Array[i] + " ");
        }
    }

    public void swap(int one, int two)
    {
        int temp = Array[one];
        Array[one] = Array[two];
        Array[two] = temp;
    }

    public void SelectionSortAlogrithem()
    {
        int min_index;
        for(int step=0; step<nElem-1; step++)
        {
            min_index = step;
            for(int i=step+1; i<nElem; i++)
            {
                if(Array[min_index]>Array[i])
                {
                    min_index=i;
                }
            }
            swap(step,min_index);
        }
    }
}








public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int maxsize = 20;
        SelectionSort A1 = new SelectionSort(maxsize);

        for(int j=0; j<maxsize; j++)
        {
            int n= (int)(java.lang.Math.random()*(maxsize-1));
            A1.insert(n);
        }

        System.out.println("\n===========Unsorted Array==========");
        A1.display();
        A1.SelectionSortAlogrithem();
        System.out.println("\n============Sorted Array===========");
        A1.display();
    }
}
