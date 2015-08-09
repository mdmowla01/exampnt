package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Use nested Map. Map<String, List<string>> list = new HAshMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		
		//Mowla's Coding
		List<String> dhaka = new ArrayList<String>();
		dhaka.add("Motijheel");
		dhaka.add("Shymoli");
		dhaka.add("Mirpur");
		
		List<String> chittagong = new ArrayList<String>();
		chittagong.add("Agrabad");
		chittagong.add("Sandwip");
		chittagong.add("Khulshi");
		
		
		List<String> comilla = new ArrayList<String>();
		comilla.add("Chandpur");
		comilla.add("Chowdhagram");
		comilla.add("MedicalArea");
		
		
		Map<String, List<String>> district = new LinkedHashMap<String, List<String>>();
		
		district.put("DHAKA", dhaka);
		district.put("CHITTAGONG", chittagong);
		district.put("COMILLA", comilla);
		
		
		System.out.println("Map Elements Retrieve by For    Loop ");
		System.out.println("====================================== ");
		
		
		for(Entry<String, List<String>> key :district.entrySet())
		{
			System.out.println(key.getKey()+ "----->"+ key.getValue());
		
		}
				
			

	}

}
