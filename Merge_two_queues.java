package QueueProg;

import java.util.LinkedList;
import java.util.Queue;

public class Merge_two_queues {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(30);
		System.out.println(ref);
		
		Queue ref1 = new LinkedList();
		ref1.add(5);
		ref1.add(40);
		ref1.offer(32);
		ref1.add(9);
		ref1.offer(54);
		System.out.println(ref1);
		
		Queue q = new LinkedList();
		q.addAll(ref);
		q.addAll(ref1);
		System.out.println(q);
	}
}
