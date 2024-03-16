package QueueProg;

import java.util.*;

public class Print_Queue_elements_using_foreach_loop {
	public static void main(String[] args) {
		Queue<Integer> ref = new LinkedList();
		ref.add(10);
		ref.add(20);
		ref.add(60);
		ref.add(80);
		for(Integer i : ref) {
			System.out.print(i+" ");
		}
	}
}
