package QueueProg;

import java.util.*;

public class Remove_item_from_Queue {
	public static void main(String[] args) {
		Queue<String> ref = new PriorityQueue();
		ref.add("hi");
		ref.add("10");
		ref.add("*");
		System.out.println(ref.remove("10"));
		System.out.println(ref);
	}
}
