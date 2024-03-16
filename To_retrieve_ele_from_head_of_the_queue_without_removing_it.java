package QueueProg;

import java.util.LinkedList;
import java.util.Queue;

public class To_retrieve_ele_from_head_of_the_queue_without_removing_it {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(30);
		System.out.println(ref);
		System.out.println(ref.peek());
		System.out.println(ref);
	}
}
