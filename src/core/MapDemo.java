package core;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");// key->unique , value->duplicate
		hm.put(4, "four");
		hm.put(6, "four");
		hm.put(4, "eleven");//overwrite 

		System.out.println(hm);
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(22));
		
		hm.remove(4); 
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		System.out.println(hm.keySet());
		
		hm.clear();
	}
}
