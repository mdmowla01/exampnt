package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32
		 * 
		 */
		   
    int firstno=100;
    int lastno=90;
    int increment=1;
    int count=0;
	
    for(count=1;count<5;count++)
	{
       
       
       if(count==2)
       {
    	   increment=2;
    	   firstno=lastno-2;
 	       lastno=lastno-20;
       }
       else if(count==3)
       {
    	   increment=3;
    	   firstno=lastno-3;
 	       lastno=lastno-30;
       }
       else 
       {
    	   increment=4;
    	   firstno=lastno-4;
 	       lastno=lastno-30;
       }
       
       for(int i=firstno;i>=lastno;)
	   {
	      System.out.print(i+",");
	      i = i-increment;
	   }
	   
	   increment=0;
	   
	   
	}
	

		     
	}
    	 
		
		
		
}

