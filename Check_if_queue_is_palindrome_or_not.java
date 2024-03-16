package QueueProg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Check_if_queue_is_palindrome_or_not {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add('n');
		ref.add('a');
		ref.offer('y');
		ref.add('a');
		ref.offer('n');
		System.out.println(ref);
		
		LinkedList r= ((LinkedList) ref).reversed();
		
		if(ref.equals(r)) {
			System.out.println("yes");
		}
		else {
			System.out.println("not");
		}
		
	}
}
