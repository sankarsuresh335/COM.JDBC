package Collections_demo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet jio= new LinkedHashSet();
		
		jio.add(25);
		
		jio.add(35);
		
		jio.add(65);
		jio.add("sachin");
		jio.add("dhoni");
		
		
		Iterator gang =jio.iterator();
		
		//boolean  gii =gang.hasNext();

		
		while(gang.hasNext()) {
			
			System.out.println("the line of the code"+gang.next());
			
			
			
		}
	}

}
