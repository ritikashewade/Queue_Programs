package QueueProg;

import java.util.*;

public class Find_second_smallest_ele_in_queue {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(55);
		System.out.println(ref);
		ArrayList ref1= new ArrayList(ref);
		Collections.sort(ref1);
		System.out.println(ref1);
		System.out.println(ref1.get(1));
	}
}
