package login;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList ();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add(12);
		
		System.out.println(ll.size());
		Iterator <String> itr=ll.iterator();
		//while(itr.hasNext(){
			System.out.println(itr.hasNext());
		}
		
		
		
	}

	

//}
