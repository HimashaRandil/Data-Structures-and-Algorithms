class SelectionSort {
    public  long[] a;
    private int nElems;

   
    
    public SelectionSort(int max){
        a=new long[max];
        
        nElems=0;
    }
    public void insert(long value){
        a[nElems]=value;
        nElems++;
    }
    public void display(){
        System.out.println("Unsorted Array");
       for(int i=0;i<nElems;i++){
           System.out.print(a[i]+"\t");
       }
    }
      public void swap(int one, int two){
       long temp = a[one];
       a[one]=a[two];
       a[two]=temp;
   }
public  void selectionsort() {
  for(int i=0;i<nElems-1;i++){
    int min_idx = i;

    for (int j = i + 1; j < nElems; j++) {

      // To sort in descending order, change > to < in this line.
      // Select the minimum element in each loop.
      if (a[j] < a[min_idx]) {
        min_idx = j;
        
      }
    }
    swap(i , min_idx);

    // put min at the correct position
    
   
    
    System.out.println("");
    System.out.println("End of "+(i+1)+" Pass" );
      for(int k=0;k<nElems;k++){
        System.out.print(a[k]+"\t");
  
  
   
    }
  }
   System.out.println("");
    System.out.println("Sorted Array");
    for(int k=0;k<nElems;k++){
        System.out.print(a[k]+"\t");
      
}
}
 
           
}




public class App 
{
    public static void main(String [] arg){
        SelectionSort a = new SelectionSort(10);
        a.insert(45);
        a.insert(76);
        a.insert(12);
        a.insert(9);
        a.insert(34);
        a.insert(90);
        a.display();
        a.selectionsort();
    
    }
}
