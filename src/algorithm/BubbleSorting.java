package algorithm;
import java.util.Random;

public class BubbleSorting {
	
	

		public static void main(String[] args) {
	        final long startTime = System.currentTimeMillis();
			
			int [] num = new int[100];
			
			Random rand = new Random();
			
			for(int i=0; i<num.length; i++){
				
			num[i] = rand.nextInt(100);
				
			}
	        
			bubbleSort(num);
			
					

			final long endTime = System.currentTimeMillis();
			final long executionTime = endTime - startTime;
			System.out.println("\n Total Execution Time in ms : " + executionTime + " sec");
				

		}
		
			
		private static void bubbleSort(int[] intArray) {
	                      
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
	        System.out.println("...............after Bubble sorting............");
			for(int i=0; i<intArray.length; i++){
				
				System.out.print(intArray[i]+",");


	    }
		}
	}






