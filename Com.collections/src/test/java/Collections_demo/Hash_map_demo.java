package Collections_demo;

import java.util.HashMap;

public class Hash_map_demo {

	public static void main(String[] args) {

		HashMap<Integer, String> jio = new HashMap<Integer, String>();

		jio.put(1, "sanksr");

		jio.put(2, "sasdf");

		jio.put(3, "yyyyy");
		jio.put(4, "aaaaa");
		jio.put(5, "qqqqq");
		jio.put(6, "eeee");
		jio.put(7, "ttttt");
		jio.put(8, "llll");
		jio.put(9, "mmmmm");
		jio.put(10, "llll");
		jio.put(11, "oooo");
		jio.put(12, "ppppp");
		
		System.out.println(jio);
		
		HashMap<Integer, String> duplicate=new HashMap<Integer,String>();
		
		duplicate.putAll(jio);
		
		System.out.println(duplicate);
		
		duplicate.clear();
		
		System.out.println("after clearing"+duplicate);
		

	}

}
