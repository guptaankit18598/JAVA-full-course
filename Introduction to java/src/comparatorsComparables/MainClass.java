package comparatorsComparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
public static void main(String[] args) {
	

	List<Student> students = new ArrayList<>();
	students.add(new Student(23,"Ram"));
	students.add(new Student(24,"Shaym"));
	students.add(new Student(25,"Ghanshyam"));
	students.add(new Student(26,"Gopal"));
	students.add(new Student(27,"Sri"));
	Collections.sort(students);
      students.forEach(System.out::println);
}
}
