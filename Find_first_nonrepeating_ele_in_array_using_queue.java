package QueueProg;

import java.util.*;
import java.util.Map.Entry;

public class Find_first_nonrepeating_ele_in_array_using_queue {
public static void main(String[] args) {
	int a[]= {1,4,6,1,4,7};
	Queue<Integer> al = new LinkedList();
	for(Integer in : a) {
		al.add(in);
	}
	System.out.println(al);
	HashMap<Integer,Integer> ref = new HashMap();
	
	for(Integer i:al) {
		int count=Collections.frequency(al, i);
		ref.put(i, count);
	}
//	System.out.println(ref);
	
	Set<Entry<Integer, Integer>> set = ref.entrySet();
	for(Entry en : set) {
		if(en.getValue().equals(1)) {
			System.out.println("first non-repeating element in an array is: "+en.getKey());
			break;
		}
	}
	
}
}
