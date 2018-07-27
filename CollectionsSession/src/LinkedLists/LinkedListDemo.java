package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListDemo {
	public static void main(String[] args)
	{
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("srisa");
		ll.add("Ranga");
		ll.add("ramanujam");
		System.out.println(ll);
		ll.addFirst("sreesa");
		ll.addLast("panchangam");
		System.out.println(ll);
		ll.remove(1);
		ll.addFirst("haha");
		ll.set(1,"Range");
		ll.add(1,"srisa");
		System.out.println(ll);
		Iterator<String> it= ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
