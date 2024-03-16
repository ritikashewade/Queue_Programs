package QueueProg;

import java.util.LinkedList;
import java.util.Queue;

public class Find_Product_of_all_ele_in_queue {
	public static void main(String[] args) {
		Queue<Integer> ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(30);
		System.out.println(ref);
		int pro=1;
		for(Integer i : ref) {
			pro=pro*i;
		}
		System.out.println(pro);
	}
}
