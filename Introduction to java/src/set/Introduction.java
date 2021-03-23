package set;

import java.util.*;

public class Introduction {

	public static void main(String[] args) {
		//output according to the memory allocation
		// Set<String> s = new HashSet<>();
		//using LinkedHashSet gives output in order of input
		// Set<String> s = new LinkedHashSet<>();
		Set<String> s = new TreeSet<>(); // input sorted
		s.add("Banana");
		s.add("kiwi");
		s.add("Apple");
		s.add("Banana");
		System.out.println(s);
		
	}

}
