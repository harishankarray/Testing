package login;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList ();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add(12);
		
		System.out.println(al);
		int size =al.size();
		/*for (int i=0; i<size; i++){
			System.out.println("Value" +al.get(i));
			
		}*/
		
		/*for(Object el:al){
		System.out.println(el);	
		}*/

		Iterator it=al.iterator();
		while (it.hasNext()){
		Object el=it.next();
		System.out.println(el);
		}
	}

}
