package Collections_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_list_demo {

	public static void main(String[] args) {

		ArrayList str = new ArrayList<>();

		str.add("sankar");
		str.add("sasi");
		str.add("mithun");
		str.add(31);
		str.add(28);
		str.add(.30);

		System.out.println(str);
		System.out.println(str.size());
		str.add("Ramarajan");
		str.add("Malliga");
		str.add("velayutham");
		str.add("vijayasekaran");
		str.add("dhatchayni");
		System.out.println(str.contains("sasi"));
		
		Iterator go=str.iterator();
		
		while(go.hasNext()) {
			
			System.out.println(go.next());
		}

		
	}

}
