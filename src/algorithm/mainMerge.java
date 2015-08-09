package algorithm;

import java.util.Random;

public class mainMerge {

	public static void main(String[] args) {
						
				final long startTime = System.currentTimeMillis();
				
				int [] num = new int[5];
				
				Random rand = new Random();
				
				for(int i=0; i<num.length; i++){
					
				num[i] = rand.nextInt(5);
					
				}

				
				Sort algo = new Sort();
				int num1[]=algo.mergeSort(num);
				
						
				System.out.println("...............after Merge sorting............");
				for(int i=0; i<num1.length; i++){
					
					System.out.print(num1[i]+",");
						
					}

				final long endTime = System.currentTimeMillis();
				final long executionTime = endTime - startTime;
				System.out.println("Total Execution Time in ms : " + executionTime + " sec");
				
				
	}

}
