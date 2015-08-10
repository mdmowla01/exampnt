package algorithm;
import java.util.Random;
import java.util.Scanner;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm use by applying into (num array). 
	 * Display the execution time for each sorting. 
	 */
	
	
	public static void main(String[] args) {
		
		
		int [] num = new int[20];
		
		Random rand = new Random();
		
	    System.out.println("Value before Sorting");
		for(int i=0; i<num.length; i++){
			
		       num[i] = rand.nextInt(20);
		       System.out.print(num[i] +",");
		     }
		     
			
		

		System.out.println("\nThis is the Sorting Time Comparison Game");
		System.out.println("Plese follow the instruction ");
		System.out.println("===========================================");
		System.out.println("Selection Sort, Put down======> 1");
		System.out.println("Insertion Sort, Put down======> 2");
		System.out.println("Merge Sort, Put down==========> 3");
		System.out.println("Bubble Sort, Put down=========> 4");
		System.out.println("Heap Sort, Put down===========> 5");
		System.out.println("Bucket Sort, Put down=========> 6");
		System.out.println("Shell Sort, Put down==========> 7");
		System.out.println("Quick Sort, Put down==========> 8");
		System.out.println("For Exit, Put down============> 0");
		
		
		for(int i=0;i<100;i++)
		{
		   @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		   int counter= input.nextInt();
		   
		   if(counter==0)
		   {
			   System.out.println("Good By");
			   break;
		   }
		   
		   else if(counter==1)
		   {
			   final long startTime = System.currentTimeMillis();
			   Sort algo = new Sort();
			   System.out.println("...............After SelectionSort............");
			   int[] result=algo.selectionSort(num);
			   algo.printSortedArray(result);
			   
			   final long endTime = System.currentTimeMillis();
			   final long executionTime = endTime - startTime;
			   System.out.println("\nTotal Execution Time in ms : " + executionTime + " milisec");
		   }
		   else if(counter==2)
		   {
			   final long startTime = System.currentTimeMillis();
			   Sort algo = new Sort();
			   System.out.println("...............After Insertion Sort............");
			   int [] result=algo.insertionSort(num);
			   algo.printSortedArray(result);
			   			   
			   final long endTime = System.currentTimeMillis();
			   final long executionTime = endTime - startTime;
			   System.out.println("\nTotal Execution Time in ms : " + executionTime + " milisec");
		   
		   }
		   
		   else if(counter==3)
		   {
			   final long startTime = System.currentTimeMillis();
			   Sort algo = new Sort();
			   System.out.println("...............After Merge Sort............");
			   int [] result=algo.mergeSort(num);
			   algo.printSortedArray(result);
			   
			   final long endTime = System.currentTimeMillis();
			   final long executionTime = endTime - startTime;
			   System.out.println("\nTotal Execution Time in ms : " + executionTime + " milisec"); 
		   
		   }
		   
		   else if(counter==4)
		   {
			   final long startTime = System.currentTimeMillis();
			   Sort algo = new Sort();
			   System.out.println("...............After Bubble Sort............");
			   int [] result=algo.bubbleSort(num);
			   algo.printSortedArray(result);
			   
			   final long endTime = System.currentTimeMillis();
			   final long executionTime = endTime - startTime;
			   System.out.println("\nTotal Execution Time in ms : " + executionTime + " milisec"); 
			   
		   
		   }
		   else if(counter==5)
		   {
			   final long startTime = System.currentTimeMillis();
			   Sort algo = new Sort();
			   System.out.println("...............After Heap Sort............");
			   int[] result=algo.heapSort(num);
			   algo.printSortedArray(result);
			   
			   final long endTime = System.currentTimeMillis();
			   final long executionTime = endTime - startTime;
			   System.out.println("\nTotal Execution Time in ms : " + executionTime + " milisec"); 
			   
		   
		   }
		   else if(counter==6)
		   {
			   final long startTime = System.currentTimeMillis();
			   Sort algo = new Sort();
			   System.out.println("...............After Bucket Sort............");
			   int[] result=algo.bucketSort(num);
			   algo.printSortedArray(result);
			   
			   final long endTime = System.currentTimeMillis();
			   final long executionTime = endTime - startTime;
			   System.out.println("\nTotal Execution Time in ms : " + executionTime + " milisec"); 
			   
		   
		   }
		   else if(counter==7)
		   {
			   final long startTime = System.currentTimeMillis();
			   Sort algo = new Sort();
			   System.out.println("...............After Shell Sort............");
			   int[] result=algo.shellSort(num);
			   algo.printSortedArray(result);
			   
			   final long endTime = System.currentTimeMillis();
			   final long executionTime = endTime - startTime;
			   System.out.println("\nTotal Execution Time in ms : " + executionTime + " milisec");
			  
		   
		   }
		   
		   else if(counter==8)
		   {
			   final long startTime = System.currentTimeMillis();
			   Sort algo = new Sort();
			   System.out.println("...............After Shell Sort............");
			   int[] result=algo.quickSort(num);
			   algo.printSortedArray(result);
			   
			   final long endTime = System.currentTimeMillis();
			   final long executionTime = endTime - startTime;
			   System.out.println("\nTotal Execution Time in ms : " + executionTime + " milisec");
			  
			   
		   }
		   
		   
		   
		   else
			{
				System.out.println("You should follow the instructions");
			}
		   counter=0;
			
		}
		
		
		
		
		
		
		
		/*System.out.println("...............after sorting............");
		for(int i=0; i<num.length; i++){
			
			System.out.print(num[i]+",");
				
			}*/

		
		
	}
}
		
		
