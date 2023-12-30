package Importantprogram;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDublicateAndPrintDublicateValue {
	
	public static void removeDublicateUsingHashSet(String name) {
		
		//OutPut : WelcomtA
		
		char[] charArray = name.toCharArray();
		
		HashSet sc = new HashSet<>();
		
		ArrayList dublicate = new ArrayList();
		
		for (char value : charArray) {
			
			if (sc.add(value)==false) {
				dublicate.add(value);
				
			}
			
		}
		
		
	
		
		
		if(name.length() == sc.size()) {
			System.out.println("No Dublicate Character");
		}
		else {
			System.out.println("Dublicate Characters are present");
			System.out.println("After Removing the Dublicate Character -  "+sc);
			System.out.println("Dublicte character List - "+dublicate);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		String name = "WelcometoAll";
		RemoveDublicateAndPrintDublicateValue.removeDublicateUsingHashSet(name);
		
	}

}
