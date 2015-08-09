package algorithm;

import java.util.Arrays;

public class Sort {

	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */

  /*
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
   }*/
     
 public int [] mergeSort(int [] array){
        int [] list = array;
<<<<<<< HEAD
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
          /* while (i < leftSize) {
               list[k] = left[i];
               k++;
               i++;
           }
           while (j < leftSize) {
        	   list[k] = right[j];
               k++;
               j++;
           
           }*/
           return list;
     }


//Bubble Sort
     
     



}
           
           
                
              
    
    
   
  /*  
    public int[] insertionSort(int [] array){
        int [] list = array;
=======
>>>>>>> 5575958255a7c9374a3ec5dc1a3c20d26897b4e3
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
    

<<<<<<< HEAD
=======
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
>>>>>>> 5575958255a7c9374a3ec5dc1a3c20d26897b4e3
    

    public int [] quickSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        
        
        

        return list;
    }

   //bucket Sorting
    public int [] bucketSort(int [] array){
        int [] list = array;
        
        
        int i, j;
        int[] count = new int[list.length];
        Arrays.fill(count, 0);

        for (i = 0; i &lt; list.length; i++) {
            count[list[i]]++;
        }

        for (i = 0, j = 0; i &lt; count.length; i++) {
            for (; count[i] &gt; 0; (count[i])--) {
                arr[j++] = i;
            }
        }
        return arr;
    }
        
        

      
  
    
    
    //Shell Sorting
    public int [] shellSort(int [] array){
        int [] list = array;
        int i1, i, j, increment, temp, number_of_elements = list.length;
        /* Shell Sort Program 
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

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        
        */
 

	
