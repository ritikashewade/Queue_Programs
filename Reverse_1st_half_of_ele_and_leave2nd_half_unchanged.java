package QueueProg;

import java.util.*;

public class Reverse_1st_half_of_ele_and_leave2nd_half_unchanged {
	public static void main(String[] args) {
		Queue ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(40);
		ref.add(66);
		System.out.println(ref);
		ArrayList ref2 = new ArrayList(ref);
		
		ArrayList ref1 = new ArrayList();
		
		int len =ref.size()/2;
		for(int i=0;i<len;i++) {
			ref1.add(ref.poll());
		}
//		System.out.println(ref1);
		List r=ref1.reversed();
//		System.out.println(r);
		
		ref2.removeAll(ref1);
//		System.out.println(ref2);
		
		Queue ref4=new LinkedList();
		ref4.addAll(r);
		ref4.addAll(ref2);
		System.out.println(ref4);
	}
}
