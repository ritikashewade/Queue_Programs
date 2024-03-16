package QueueProg;

import java.util.*;
import java.util.Map.Entry;

public class Remove_all_occurrences_of_specific_ele_from_queue {
	public static void main(String[] args) {
	
		Queue ref = new LinkedList();
		ref.add(30);
		ref.add(20);
		ref.add(10);
		ref.add(40);
		ref.add(30);
		ref.add(30);
		System.out.println(ref);
		
		ArrayList ref1 = new ArrayList(ref);
		
		TreeMap ref2 = new TreeMap();
		for(Object i:ref1) {
			int count=Collections.frequency(ref1, i);
			ref2.put(i, count);
		}
		System.out.println(ref2);
		
		ArrayList ref3 = new ArrayList();
		
		Set<Entry> set = ref2.entrySet();
		for(Entry en : set) {
			int val =(Integer) en.getValue();
			if(val==1) {
				ref3.add(en.getKey());
			}
			}
		System.out.println(ref3);
		
	
	}
}
