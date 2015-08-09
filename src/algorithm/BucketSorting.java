package algorithm;

import java.util.Random;

public class BucketSorting {

	public static void main(String[] args) {
		
		final long startTime = System.currentTimeMillis();		
		int [] num = new int[100];		
		Random rand = new Random();		
		for(int i=0; i<num.length; i++){			
		num[i] = rand.nextInt(100);
			
		}
        
		
		int maxValue = maxValue(num);
		bucketSort(num,maxValue);
			

		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		System.out.println("\n Total Execution Time in ms : " + executionTime + " sec");
			
		
	}
		
	
	//bucket Sorting
	
	static void bucketSort(int[] sequence, int maxValue) 
    {
        // Bucket Sort
        int[] Bucket = new int[maxValue + 1];
        int[] sorted_sequence = new int[sequence.length];
 
        for (int i = 0; i < sequence.length; i++)
            Bucket[sequence[i]]++;
 
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sorted_sequence[outPos++] = i;
 
         printSequence(sorted_sequence);
    }
 
    static void printSequence(int[] sorted_sequence) 
    {
        for (int i = 0; i < sorted_sequence.length; i++)
            System.out.print(sorted_sequence[i] + " ");
    }
 
    static int maxValue(int[] sequence) 
    {
        int maxValue = 0;
        for (int i = 0; i < sequence.length; i++)
            if (sequence[i] > maxValue)
                maxValue = sequence[i];
        return maxValue;
    }
    
}
