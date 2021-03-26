package map;
import java.util.*;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		Pen pen1 = new Pen(10,"Blue");
		Pen pen2 = new Pen(10,"Blue");
		System.out.println(pen1.equals(pen2));
		Set<Pen> pens = new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		System.out.println(pens);
	}

}
class Pen{
	String color;
	int price;
	public Pen(int price , String color) {
		this.color = color;
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
}
