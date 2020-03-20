package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(2);
		al.add("jhgfd");
		al.add(5);
		//System.out.println(al.size());
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(3);
		ar.add(6);
		
		//al.addAll(ar); // for adding all element
		ar.addAll(al);
//		al.retainAll(ar); // for getting common element and remove other element of list. 
//		//al.removeAll(ar); for remove added element.
//		for(int i=0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
		Iterator itr = ar.iterator();
		while (itr.hasNext()) {
			Integer object =  (Integer) itr.next();
			System.out.println(object);
		}
		
//		for (Integer integer : ar) {
//			System.out.println(integer);
//		}
	}

}
