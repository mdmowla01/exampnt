package algorithm;



public class Sort {

	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */
	
	 private static int total=0;
	 private int array[];
	 private int length;

  //Selection Sort
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
   } //Selection Sort Ending
     
    //Bubble Sort
    public int[] bubbleSort(int[] array) {
        
        int[] intArray=array;
    	int n = intArray.length;
        int temp = 0;
       
        for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                       
                        if(intArray[j-1] > intArray[j]){
                                //swap the elements!
                                temp = intArray[j-1];
                                intArray[j-1] = intArray[j];
                                intArray[j] = temp;
                        }
                       
                }
        }
        return intArray;
    } // Bubble Sort Ending

 
//Insertion Sort
  
    public int[] insertionSort(int [] array){
        int [] list = array;
        int temp;
        for(int i=1;i<list.length;i++){
			 temp=list[i];
			for(int j=i-1;j>=0 && temp<list[j];j--){
				list[j+1]=list[j];
				list[j]=temp;
			}
		}   
        return list;
    
      
  }//Ending Insertion Sort
  
  // Merge Sort 
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
      list=merge (left,right,list);
      return list;
   }        
   
   public static int[] merge (int[] left,int[] right, int[] list)
   {
         int i=0;
         int j=0;
         int k=0;
         
         
         int leftSize=left.length;
         int rightSize=right.length;
         
         while (i < leftSize && j < rightSize) {
             if (left[i] <= right[j]) {
                 list[k] = left[i];
                 i++;
                 k++;
             } else {
                 list[k] = right[j];
                 k++;
                 j++;
             }
         }
        while (i < leftSize) {
             list[k] = left[i];
             k++;
             i++;
         }
         while (j < leftSize) {
      	   list[k] = right[j];
             k++;
             j++;
         
         }
         return list;
   } // Ending Merge Sort
  
   // Heap Sort
   
   public int [] heapSort(int [] array){
       int [] list = array;
       Integer[] result=new Integer[list.length];
       //converting int[] into Integer[]
       for(int i=0;i<list.length;i++){
       	result[i]=Integer.valueOf(list[i]);
       }
      
       total=array.length-1;
		
		for(int i=total/2;i>=0;i--)
			heap(result,i);
		for(int i=total;i>0;i--){
			swap(result,0,i);
			total--;
			heap(result,0);
		}
		  //converting integer[] into Int[]
       for(int i=0;i<list.length;i++){
       	list[i]=result[i].intValue();
       }
       return list;
   }
   //Helper Method to heapSort()
   
   public static void swap(@SuppressWarnings("rawtypes") Comparable[] arr, int a, int b){
		@SuppressWarnings("rawtypes")
		Comparable temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	//Helper Method to heapSort()
	@SuppressWarnings("unchecked")
	private static void heap(@SuppressWarnings("rawtypes") Comparable[] arr, int i){
		int left=i*2;
		int right=left+1;
		int grt=i;
		
		if(left<=total && arr[left].compareTo(arr[grt])>0) 
			grt=left;
		if(right<=total && arr[right].compareTo(arr[grt])>0)
			grt=right;
		if(grt!=i){
			swap(arr,i,grt);
			heap(arr,grt);
		}
	}
    
  
      
  //Bucket Sort
 public int [] bucketSort(int[] array) 
  {
        
	    int [] list=array;
	    int maxValue = maxValue(list);
	 
	    
        int[] Bucket = new int[maxValue + 1];
        int[] sorted_sequence = new int[list.length];
 
        for (int i = 0; i < list.length; i++)
            Bucket[list[i]]++;
 
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sorted_sequence[outPos++] = i;
 
         return sorted_sequence;
    }
 
    
 
    static int maxValue(int[] sequence) 
    {
        int maxValue = 0;
        for (int i = 0; i < sequence.length; i++)
            if (sequence[i] > maxValue)
                maxValue = sequence[i];
        return maxValue;
    }
	
  
  //Shell Sorting
    public  int[]  shellSort(int [] array){
        int [] list = array;
        int  i, j, increment, temp, number_of_elements = list.length;
                for (increment = number_of_elements / 2; increment > 0; increment /= 2)
        {
               for (i = increment; i < number_of_elements; i++)
            {
                   temp = list[i];
                       for (j = i; j >= increment; j -= increment) 
                   {
                           if (temp < list[j - increment]) {
                               list[j] = list[j - increment];
                           } else {
                               break;
                           }
                       }
                      list[j] = temp;
           }
       }
       return list; 
    }
  
  //Quick Sort
    
    public int [] quickSort(int [] array){
        int [] list = array;
        if(array==null||array.length==0){
        	return list;
        }
        this.array=array;
        length=array.length;
        quickSort(0,length-1);

        return list;
    }
	private void quickSort(int lowerIndex, int higherIndex){
		int i=lowerIndex;
		int j=higherIndex;
		
		int pivot=array[lowerIndex+(higherIndex-lowerIndex)/2];
		
		while(i<=j){
			while(array[i]<pivot){
				i++;
			}
			while(array[j]>pivot){
				j--;
			}
			if(i<=j){
				exchangeNumber(i,j);
				
				i++;
				j--;
			}
		}
		
		if(lowerIndex<j)
			quickSort(lowerIndex,j);
		if(i<higherIndex)
			quickSort(i,higherIndex);
	}
	
	private void exchangeNumber(int i, int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
//Quick Sort ending
    
  
  //Print Array After Sorting
  
  public void printSortedArray(int [] array){
	    
	    for(int i=0; i<array.length; i++){
          System.out.print(array[i]+",");
      }
  }
    

} 