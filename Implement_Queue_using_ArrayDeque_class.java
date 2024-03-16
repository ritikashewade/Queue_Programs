package QueueProg;

import java.util.*;

public class Implement_Queue_using_ArrayDeque_class {
	public static void main(String[] args) {
		Queue ref = new ArrayDeque();
		ref.add("Hello");
		ref.add(10);
		ref.add('$');
//		System.out.println(ref);
		Iterator itr = ref.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
}
