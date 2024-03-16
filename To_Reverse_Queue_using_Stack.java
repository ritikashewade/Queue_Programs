package QueueProg;

import java.util.*;


public class To_Reverse_Queue_using_Stack {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(30);
		
		Stack ref1 = new Stack();
		
		while(!ref.isEmpty()) {
			ref1.add(ref.poll());
		}
		System.out.println(ref1);
		
		while(!ref1.isEmpty()) {
			ref.add(ref1.pop());
		}
		System.out.println(ref);
	}
}
