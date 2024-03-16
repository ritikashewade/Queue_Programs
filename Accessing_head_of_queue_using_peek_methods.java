package QueueProg;

import java.util.LinkedList;
import java.util.Queue;

public class Accessing_head_of_queue_using_peek_methods {
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
