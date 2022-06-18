package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayListSimple{
	public static void main(String args[]) {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		marks.put(" Saman ", 10);
		marks.put(" Kamal ", 20);
		marks.put(" Nimal ", 40);
		
		for(Entry<String, Integer> mark : marks.entrySet()) {
			System.out.println(mark.getKey() + "-" + mark.getValue());
				
		}
		
	}
		
}




/*
 //array list
import java.util.ArrayList;

public class ArrayListSimple {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println(" initial size " + list.size());
		
		list.add("A");
		list.add("E");
		list.add("I");
		list.add("O");
		list.add("U");
		
		System.out.println(" after adding size " + list.size());
		
		list.remove(3);
		
		System.out.println("after remove size " + list.size());
		
		for (String string : list) {
			System.out.println(string);	
		}
		
	}
		
}

*/

