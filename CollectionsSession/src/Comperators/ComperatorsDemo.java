package Comperators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComperatorsDemo {
 
	public static void main(String[] args)
	{
		ArrayList<students> ad = new ArrayList<students>();
		ad.add(new students("srisa",21));
		ad.add(new students("Ketha",20));
		ad.add(new students("SHankar",22));
	  Comparator<students> com = new Comparator<students>(){

		@Override
		public int compare(students s1, students s2) {
			if(s1.age>s2.age)
				return 1;
			if(s1.age<s2.age)
				return -1;
			else
				return 0;
			// TODO Auto-generated method stub
			//return 0;
		}
		  
	  };
	Collections.sort(ad,com);
	for(students s2 : ad )
		System.out.println(s2.name + " " + s2.age);
	//System.out.println(ad);
}		
}
