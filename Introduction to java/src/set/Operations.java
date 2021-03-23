package set;
import java.util.*;
public class Operations {

	public static void main(String[] args) {
		Set<Integer> x = new HashSet<>();
               x.add(12);
               x.add(13);
               x.add(14);
               Set<Integer> y = new HashSet<>();
               y.add(14);
               y.add(15);
               y.add(16);
               // to find the Union of set
              // x.addAll(y);
               //to find the Intersection
               x.retainAll(y);
               // check for the present values in both set
               System.out.println(x.containsAll(y));
               System.out.println(x);
	}

}
