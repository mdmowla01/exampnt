package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		//Mowla's Coding
		
		Stack<String> stk = new Stack<String>();
		
		stk.add("Masud");
		stk.add("Opu");
		stk.add("Sadia");
		stk.add("Toni");
		stk.add("Toma");
		
		System.out.println("Stack Elements Retrieve before remove ");
		System.out.println("=====================================");
		for(String name:stk)
		{
			System.out.println(name);
		}
		
		System.out.println("Peek element:"+stk.peek() );
		
		stk.remove(4);
		stk.remove("Masud");
		
		
			
		System.out.println("Stack Elements Retrieve by For Each Loop ");
		System.out.println("============================================== ");
		
		for(String name:stk)
		{
		  System.out.println(name);
		 
		}
		
		System.out.println("Stack Elements Retrieve by Iterator ");
		System.out.println("======================================== ");
		
        
		
		Iterator<String> iter = stk.iterator();
		
		while(iter.hasNext()){
			
			System.out.println(iter.next());
		}
		

}

	}


