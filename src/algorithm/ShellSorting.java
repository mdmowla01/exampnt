package algorithm;

import java.util.Random;

public class ShellSorting {

	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();		
		int [] num = new int[100];		
		Random rand = new Random();		
		for(int i=0; i<num.length; i++){			
		num[i] = rand.nextInt(100);
			
		}
		shellSort(num);
        		
		
		
		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		System.out.println("\n Total Execution Time in ms : " + executionTime + " sec");
	}
	
	
	//Shell Sorting
    public static void  shellSort(int [] array){
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
      System.out.println("...............after Bubble sorting............"); 
       for(int m=0; m<list.length; m++){
           System.out.print(list[m]+",");
        }
             
          
        
    }

    
        
        

}
