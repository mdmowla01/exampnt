package algorithm;

public class Sort {

	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */


    public int[] selectionSort(int [] array){
        int [] list = array;
        int temp;
        for(int i=0; i<list.length; i++){
            for(int j=i+1; j<list.length; j++) {
                if (list[i] > list[j]) {
                    temp=list[j];
                    list[j]=list[i];
                    list[i]=temp;
                }
            }
        }

        return list;
    }

    public int[] insertionSort(int [] array){
        int [] list = array;
        for(int i=1;i<list.length;i++)
        {
            int temp= list[i];
            int j;
            
            for(j=i-1; j>=0 && temp < list[j];j--)
            {
            	list[j+1]=list[j];
            }
        }
        
             
        
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        int temp=0;
        for(int k=0;k<list.length;k++)
        {
        	for(int l=1;l<list.length-1;l++)
        	{
        	  if( list[l-1]>list[l] )
        	  {
        	     temp=list[l-1];
        	     list[k-1]=list[k];
        	     list[l]=temp;
        	     
        	  }
        		  
        		  
        	}
        }
        
           
        
        
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        int size=list.length;
        if(size<2)
          return list;
        int middle=size/2;
        int leftSize=middle;
        int rightSize=size-middle;
        
        int[] left= new int[leftSize];
        int[] right= new int[rightSize];
        
        for(int m=0;m<middle;m++)
        {
          left[m]=list[m];
        }
        
        for(int n=middle;n < size;n++)
        {
           right[n-middle]=list[n];
        }
        
        mergeSort(left);
        mergeSort(right);
        merge(left,right,list);
        
        public static void merge (int[] left, int[] right,int[] list )
        {
           int i=0;
           int j=0;
           int k=0;
           
           int leftSize=left.length;
           int rightSize=rigth.length;
           
           While(i < leftSize && j< leftSize)
           {
        	    if(lef[i]) <= right[j])

           }
           
           
           
        }
        
        
        

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}