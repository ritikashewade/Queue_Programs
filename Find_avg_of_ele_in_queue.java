package QueueProg;

import java.util.LinkedList;
import java.util.Queue;

public class Find_avg_of_ele_in_queue {
	public static void main(String[] args) {
		Queue<Integer> ref = new LinkedList();
		ref.add(4);
		ref.add(30);
		ref.offer(1);
		ref.add(10);
		ref.offer(30);
		System.out.println(ref);
		float sum=0;
		
		for(Integer i : ref) {
			sum=sum+i;
		}
		float avg=sum/ref.size();
		System.out.println(avg);
	}
}
