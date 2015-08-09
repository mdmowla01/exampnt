package algorithm;
import java.util.Random;


public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm use by applying into (num array). 
	 * Display the execution time for each sorting. 
	 */

	public static void main(String[] args) {
		
		final long startTime = System.currentTimeMillis();
		
		int [] num = new int[100];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(100);
			
		}

		//Example for Selection Sort
		Sort algo1 = new Sort();
		algo1.selectionSort(num);
		
				
		System.out.println("...............after sorting............");
		for(int i=0; i<num.length; i++){
			
			System.out.println(num[i]);
				
			}

		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		System.out.println("Total Execution Time in ms : " + executionTime + " sec");
		
		
		
		//Merge Sort
				Sort algo2 = new Sort();
				algo2.mergeSort(num);						
				
				System.out.println("...............after sorting............");
				for(int i=0; i<num.length; i++){
					
					System.out.println(num[i]);
						
					}

				final long endTime1 = System.currentTimeMillis();
				final long executionTime1 = endTime - startTime;
				System.out.println("Total Execution Time in ms : " + executionTime + " sec");
		
		/*		
		//Bubble Sort
				Sort algo = new Sort();
				algo.bubbleSort(num);
				
				
				
				System.out.println("...............after sorting............");
				for(int i=0; i<num.length; i++){
					
					System.out.println(num[i]);
						
					}

				final long endTime = System.currentTimeMillis();
				final long executionTime = endTime - startTime;
				System.out.println("Total Execution Time in ms : " + executionTime + " sec");
		
		//Bucket Sort
				Sort algo = new Sort();
				algo.bucketSort(num);
				
				
				
				System.out.println("...............after sorting............");
				for(int i=0; i<num.length; i++){
					
					System.out.println(num[i]);
						
					}

				final long endTime = System.currentTimeMillis();
				final long executionTime = endTime - startTime;
				System.out.println("Total Execution Time in ms : " + executionTime + " sec");
		
		//Heap Sort
				Sort algo = new Sort();
				algo.heapSort(num);
				
				
				
				System.out.println("...............after sorting............");
				for(int i=0; i<num.length; i++){
					
					System.out.println(num[i]);
						
					}

				final long endTime = System.currentTimeMillis();
				final long executionTime = endTime - startTime;
				System.out.println("Total Execution Time in ms : " + executionTime + " sec");
		
			//Insertion Sort
				Sort algo = new Sort();
				algo.selectionSort(num);
				
				
				
				System.out.println("...............after sorting............");
				for(int i=0; i<num.length; i++){
					
					System.out.println(num[i]);
						
					}

				final long endTime = System.currentTimeMillis();
				final long executionTime = endTime - startTime;
				System.out.println("Total Execution Time in ms : " + executionTime + " sec");
		     
				//Quick Sort
				Sort algo = new Sort();
				algo.selectionSort(num);
				
				
				
				System.out.println("...............after sorting............");
				for(int i=0; i<num.length; i++){
					
					System.out.println(num[i]);
						
					}

				final long endTime = System.currentTimeMillis();
				final long executionTime = endTime - startTime;
				System.out.println("Total Execution Time in ms : " + executionTime + " sec");
				
		    //Shell Sort
				Sort algo = new Sort();
				algo.selectionSort(num);
				
				
				
				System.out.println("...............after sorting............");
				for(int i=0; i<num.length; i++){
					
					System.out.println(num[i]);
						
					}

				final long endTime = System.currentTimeMillis();
				final long executionTime = endTime - startTime;
				System.out.println("Total Execution Time in ms : " + executionTime + " sec"); */
	}

}
