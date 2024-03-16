package QueueProg;

import java.util.LinkedList;
import java.util.Queue;

public class Add_elements_to_Queue_using_add_offer_methods {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(30);
		System.out.println(ref);
	}
}
