package Queues;

import java.util.PriorityQueue;

public class QueuesDemo {
	public static void main(String[] args)
	{
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.add(6);
		q.add(5);
		q.add(3);
		q.add(7);
		q.add(1);
		q.add(2);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
	}

}
