package QueueProg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Find_sum_of_all_odd_numbers_in_queue {
	public static void main(String[] args) {
		Queue<Integer> ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(37);
		System.out.println(ref);
		
		ArrayList<Integer> ref1 = new ArrayList();
		
		Iterator itr=ref.iterator();
		
		while(itr.hasNext()) {
			int ele = (Integer)itr.next();
			if(ele%2!=0) {
				ref1.add(ele);
			}
		}
		System.out.println(ref1);
		int sum=0;
		for(Integer i:ref1) {
			sum=sum+i;
		}
		System.out.println(sum);
		
	}
}
