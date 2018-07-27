package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		//ar.add("hello");
		ar.remove(2);
		//for(int i=0;i<ar.size();i++)
		//{
		//	System.out.println(ar.get(i));
		//}
		//System.out.println("Hello");
		Employee e1= new Employee("Srisa",21);
		Employee e2= new Employee("Raman",22);
		Employee e3= new Employee("Ranga",23);
		ArrayList<Employee> ar1= new ArrayList<Employee>();
		//System.out.println("Hello");
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
	   Iterator<Employee> it= ar1.iterator();
	   System.out.println(it.hasNext());
	   while(it.hasNext());
	   {
		  // System.out.println(it.hasNext());
		   
		   Employee emp=it.next();
		   System.out.println("Employee name" + emp.Name + "Employee age" + emp.age);
	   }
		   
		   
		// TODO Auto-generated method stub

	}

}
