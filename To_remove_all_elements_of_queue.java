package QueueProg;

import java.util.LinkedList;
import java.util.Queue;

public class To_remove_all_elements_of_queue {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.add(10);
		System.out.println(ref);
		ref.clear();
		System.out.println(ref);
	}
}
