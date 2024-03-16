package QueueProg;

import java.util.LinkedList;
import java.util.Queue;

public class Check_if_queue_contains_specific_ele {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(30);
		System.out.println(ref);
		
		if(ref.contains(1)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
