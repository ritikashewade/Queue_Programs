package QueueProg;

import java.util.*;

public class Find_min_ele_in_queue_without_removing_it_from_queue {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(30);
		System.out.println(ref);
		ArrayList ref1= new ArrayList(ref);
		Collections.sort(ref1);
		System.out.println(ref1);
		System.out.println(ref1.getFirst());
		
	}
}
