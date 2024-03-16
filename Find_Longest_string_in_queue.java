package QueueProg;

import java.util.*;
import java.util.Map.Entry;

public class Find_Longest_string_in_queue {
	public static void main(String[] args) {
		Queue<String> ref = new LinkedList();
		ref.add("Shubhratri");
		ref.add("suprabhat");
		ref.add("sasriyakaal");
		ref.add("hello");
		System.out.println(ref);
		
		HashMap ref1 = new HashMap();
		for(Object obj : ref) {
			int count=Collections.frequency(ref, ref.peek());
			ref1.put(obj, count);
		}
		
		HashMap ref2 = new HashMap();
		
		Set<Entry> set =ref1.entrySet();
		for(Entry en:set) {
			int str=(Integer) en.getKey().toString().length();
			ref2.put(en.getKey(), str);
		}
		System.out.println(ref2);
		
		ArrayList ref3=new ArrayList();
		Set<Entry> set1 = ref2.entrySet();
		for(Entry en1:set1) {
			ref3.add(en1.getValue());
		}
		Collections.sort(ref3);
		int len = (Integer)ref3.getLast();
		
		Set<Entry> set3 = ref2.entrySet();
		for(Entry en2:set3) {
			if(en2.getValue().equals(len)) {
				System.out.println(en2.getKey());
			}
		}
		
	}
}
