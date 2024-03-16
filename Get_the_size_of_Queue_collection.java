package QueueProg;

import java.util.*;

public class Get_the_size_of_Queue_collection {
	public static void main(String[] args) {
		Queue<Integer> ref= new LinkedList();
		ref.add(10);
		ref.add(30);
		ref.add(60);
		System.out.println(ref);
		System.out.println(ref.size());
	}
}
