package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		//Mowla's Coding
		
		LinkedList<String> arr = new LinkedList<String>();
		
		arr.add("Masud");
		arr.add("Opu");
		arr.add("Sadia");
		arr.add("Toni");
		arr.add("Toma");
		
		System.out.println("Linked List Elements Retrieve before remove ");
		System.out.println("=========================================== ");
		for(String name:arr)
		{
			System.out.println(name);
		}
		System.out.println("Peek element:"+arr.peek() );
		
		arr.remove(4);
		arr.remove("Masud");
		
		
			
		System.out.println("Linked List Elements Retrieve by For Each Loop ");
		System.out.println("============================================== ");
		
		for(String name:arr)
		{
		  System.out.println(name);
		 
		}
		
		System.out.println("Linked List Elements Retrieve by Iterator ");
		System.out.println("============================================== ");
		
        Iterator<String> iter = arr.listIterator();
		
		while(iter.hasNext()){
			
			System.out.println(iter.next());
		}
		
		

	}

}
