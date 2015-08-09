package math;



public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on given range.
		 * 
		 */
		
		//Mowla's Coding
		long first_number = 2;
	    long ending_number = 1000000;
        long totals = 0;
		
        for (long k = first_number; k <= ending_number; k++) {
		     long sqr_root = (long) Math.sqrt(k);
		     boolean is_prime = true;
		     for (long i = 2; i <= sqr_root; i++) {
		
			      if (k % i == 0) {
			    	  is_prime = false; 
		           }
		
			 }
		
			 if (is_prime) {
		        System.out.println(k);
	            totals++;
	            }
	
	    }
		System.out.println("Total:"+totals);	
   }
	
}
		  	


