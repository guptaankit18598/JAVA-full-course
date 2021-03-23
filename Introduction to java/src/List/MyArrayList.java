package List;
import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
	//	ArrayList<String> vegetables= new ArrayList<>();
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("mango");
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
//		fruits.addAll(vegetables);
		for(String e : temp)
        System.out.println(e);
//		Pair<String,Integer> pair = new Pair("Ankit" , 23);
//		Pair<Boolean,Double > pair2 = new Pair(true , 23.214);
//		pair2.getDescription();
//		pair.getDescription();
	}

}
