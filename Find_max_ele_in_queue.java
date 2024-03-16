package QueueProg;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Find_max_ele_in_queue {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(30);
		System.out.println(ref);
		
		LinkedList ref1 = (LinkedList)ref;
		Collections.sort(ref1);
		System.out.println(ref1);
		System.out.println(ref1.getLast());
	}
}
