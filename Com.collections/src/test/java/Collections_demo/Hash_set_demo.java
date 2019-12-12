package Collections_demo;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hash = new HashSet();

		hash.add("high");
		hash.add(2);
		hash.add(0.35);
		hash.add("close");
		hash.remove(2);

		Iterator hi = hash.iterator();

		hash.contains(3);

		while (hi.hasNext()) {

			System.out.println("the value is " + hi.next());
		}

	}

}
