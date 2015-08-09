package algorithm;

import java.util.Random;

public class heapSorting {

	public static void main(String[] args) {
		 final long startTime = System.currentTimeMillis();
			
			int [] num = new int[100];
			
			Random rand = new Random();
			
			for(int i=0; i<num.length; i++){
				
			num[i] = rand.nextInt(100);
				
			}
	        
			heapSort(num);
							

			final long endTime = System.currentTimeMillis();
			final long executionTime = endTime - startTime;
			System.out.println("\n Total Execution Time in ms : " + executionTime + " sec");
	}
	
	public static void  heapSort(int [] list){
        int arr[] = list;
        
         int count=0;
       
        heapify(arr);
            
            for (int i = count; i > 0; i--)
            {
                swap(arr,0, i);
                count = count-1;
                maxheap(arr, 0);
            }
        }     
        /* Function to build a heap */   
        public  static void heapify(int arr[])
        {
            int count=0;
        	count = arr.length-1;
            for (int i = count/2; i >= 0; i--)
                maxheap(arr, i);        
        }
        /* Function to swap largest element in heap */        
        public static void maxheap(int arr[], int i)
        { 
            int count=0;
        	int left = 2*i ;
            int right = 2*i + 1;
            int max = i;
            if (left <= count && arr[left] > arr[i])
                max = left;
            if (right <= count && arr[right] > arr[max])        
                max = right;
     
            if (max != i)
            {
                swap(arr, i, max);
                maxheap(arr, max);
            }
        }    
        /* Function to swap two numbers in an array */
        public static void swap(int arr[], int i, int j)
        {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp; 
        }
        
        
       
	}




