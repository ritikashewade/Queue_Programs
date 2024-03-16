package QueueProg;

import java.util.LinkedList;
import java.util.Queue;

public class Removing_ele_from_queue_using_poll_methods {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(30);
		System.out.println(ref);
		System.out.println(ref.poll());
		System.out.println(ref.poll());
		System.out.println(ref);
	}
}
