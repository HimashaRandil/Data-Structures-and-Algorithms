class BubbleSort
{
    //variables
    private int [] array;
    private int nElem;

    // constructor
    public BubbleSort(int size)
    {
        array = new int[size];
        nElem=0;
    }

    // methods
    public void insert(int value)
    {
        if(nElem == array.length) 
        {   
            System.out.println("The Array Is Full!\n");
            return;
        }

        System.out.println("Inserting : " + value );
        array[nElem++]= value;
    }

    public void display()
    {
        System.out.println("========= Array Elements =========\n");
        for(int i =0; i<nElem; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public void swap(int one, int two)
    {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}



public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello, World!");
    }
}
