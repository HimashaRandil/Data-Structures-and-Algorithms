
class Array
{
    // variables 
    private int [] arr;
    private int nElem;

    //constructor
    public Array(int size)
    {
        arr = new int[size];
        nElem = 0;
    }

    // insert method
    public void insert(int value)
    {
        if(nElem == arr.length)
        {
            System.out.println("Array is Full!\nCan't insert elements!");
        }
        else
        {
            arr[nElem]=value;
            nElem++;
        }
    }

    public void display()
    {
        for(int i=0; i<nElem; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void InsertionSort()
    {
        for(int step=1; step<arr.length; step++ )
        {
            int key=arr[step];
            int j = step-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;
            System.out.println("Step : " + step);
            display();
        }
    }

}



public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int maxsize = 10;
        Array A1 = new Array(maxsize);

        for(int j=0; j<maxsize; j++)
        {
            int n= (int)(java.lang.Math.random()*(maxsize-1));
            A1.insert(n);
        }

        System.out.println("\n===========Unsorted Array==========");
        A1.display();
        A1.InsertionSort();
        System.out.println("\n============Sorted Array===========");
        A1.display();
    }
}
