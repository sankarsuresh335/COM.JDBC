package Collections_demo;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set_demo {

	public static void main(String[] args) {
		
		
		TreeSet tree=new TreeSet();
		
		tree.add(55);
		
		tree.add(25);
		
		tree.add(36);
		
		tree.add(25);
		
		tree.add(75);
		
		
		tree.contains(25);
		
		Iterator hi=tree.iterator();
		
		while(hi.hasNext()) {
			
			System.out.println(" this is the output"+hi.next());
			
			
			
		}
		
		
	}

}
