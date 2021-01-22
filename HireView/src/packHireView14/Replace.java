package packHireView14;

import java.util.Collections;
import java.util.LinkedList;

public class Replace {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("Java");
		list.add("is");
		list.add("multithreaded");
		list.add("and");
		list.add("platform");
		list.add("independent");
		
		Collections.swap(list, 2, 6);
		for(String st:list) {
			System.out.println("list is "+st);
		}
	}

}
