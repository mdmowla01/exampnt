package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 */

		String textFile = "/SuperSonic/src/data/becoming-a-developer.txt";
		
		//Mowla's Code
		
		FileReader file=null;
		BufferedReader br=null;
		
		String stg="";	
		try{
			
			file= new FileReader(textFile);
			
		
		}catch (FileNotFoundException e)
		{
		   System.out.println("This is Not a Valid Text Path");
		}
		
		try{
		
			br=new BufferedReader(file);
			
			while((stg = br.readLine()) != null)
			{
				System.out.println(stg);
			}
						
		}catch(IOException e)
		{
		  e.printStackTrace();
		}
		
		finally
		{
			try{
				br.close();
			}catch(IOException e)
			{
				  e.printStackTrace();
				}
		
		     try{
			     file.close();
		     }catch(IOException e)
		     {
			      e.printStackTrace();
		     }
		}
		}

	}

