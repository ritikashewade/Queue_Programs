package QueueProg;

import java.util.*;

public class To_compare_two_queues {
	public static void main(String[] args) {
		Queue<Integer> ref= new LinkedList();
		ref.add(10);
		ref.add(20);
		ref.add(30);
		
		Queue<Integer> ref1= new LinkedList();
		ref1.add(10);
		ref1.add(20);
		ref1.add(30);
		if(ref.equals(ref1)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
