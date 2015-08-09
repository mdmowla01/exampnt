package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		//Mowla's Coding Start
		
		ArrayList<String> arr= new ArrayList<String>(3);
		
		arr.add("Masud");
		arr.add("Opu");
		arr.add("Sadia");
		arr.add("Toni");
		arr.add("Toma");
		
		
		System.out.println("Array List Elements Retrieve before Remove ");
		System.out.println("========================================= ");
		for(String name:arr)
		{
			System.out.println(name);
		}
		
		arr.remove(4);
		arr.remove("Masud");
		
		
		System.out.println("Array List Elements Retrieve by For Each ");
		System.out.println("========================================= ");
		for(String name:arr)
		{
			System.out.println(name);
		}
		
		
		System.out.println("Array List Elements Retrieve by Iterator ");
		System.out.println("============================================== ");
		
        Iterator<String> iter = arr.listIterator();
		
		while(iter.hasNext()){
			
			System.out.println(iter.next());
		}
		
	

	}

}
