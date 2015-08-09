package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		//Mowla's Coding
		
				Queue<String> que = new LinkedList<String>();
				
				que.add("Masud");
				que.add("Opu");
				que.add("Sadia");
				que.add("Toni");
				que.add("Toma");
				
				System.out.println("Que Elements Retrieve before remove ");
				System.out.println("=====================================");
				for(String name:que)
				{
					System.out.println(name);
				}
				
				System.out.println("Peek element:"+que.peek() );
				
				que.remove(4);
				que.remove("Masud");
				
				
					
				System.out.println("Queue Elements Retrieve by For Each Loop ");
				System.out.println("============================================== ");
				
				for(String name:que)
				{
				  System.out.println(name);
				 
				}
				
				System.out.println("Linked List Elements Retrieve by Iterator ");
				System.out.println("============================================== ");
				
		        
				
				Iterator<String> iter = que.iterator();
				
				while(iter.hasNext()){
					
					System.out.println(iter.next());
				}
				
				


	}

}
