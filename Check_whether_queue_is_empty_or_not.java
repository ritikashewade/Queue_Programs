package QueueProg;

import java.util.*;

public class Check_whether_queue_is_empty_or_not {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.add(10);
		System.out.println(ref);
		if(ref.isEmpty())
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("Not");
		}
	}
	
}
