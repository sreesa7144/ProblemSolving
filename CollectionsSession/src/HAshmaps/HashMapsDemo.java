package HAshmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapsDemo {

	public static void main(String[] args) {
		//here we are going to learn about key value pairs
		ArrayList<student> ar= new ArrayList<student>();
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		// TODO Auto-generated method
		hm.put(1,"Srisa");
		hm.put(2,"Shankar");
		hm.put(3,"ketha");
		hm.put(4,"gopi");
		hm.remove(3);
		student s= new student("Srisa",161);
		System.out.println(hm.entrySet());
		for(Entry<Integer,String> m: hm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue() );
		}	
		//lets strt experiment with the students class
		ar.add(s);
		Iterator<student> it= ar.iterator();
		while(it.hasNext())
		{
			student s2 = it.next();
			System.out.println(s2.name + s2.id);
		}
    //System.out.println(s.name);
		HashMap<Integer,student> hs= new HashMap<Integer,student>();
		student s1= new student("gopi",160);
		hs.put(1,s1);
		for(Entry<Integer,student> m1: hs.entrySet())
		{
			student s5=m1.getValue();
			System.out.println(s5.name + s5.id);
			
		}
			
	}

}
