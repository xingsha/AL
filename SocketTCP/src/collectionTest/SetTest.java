package collectionTest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set<Book1> set = new HashSet<Book1>();
		set.add(new Book1("java",66));
		set.add(new Book1("java",66));
		set.add(new Book1("C++",46));
		set.add(new Book1("py",88));
		//System.out.println(set);
		Iterator<Book1> ib = set.iterator();
		while(ib.hasNext()){
			System.out.println(ib.next());
		}
		/**
		 * 
		 */
		/*Map<String,Double> bm = new HashMap<String,Double>();
		bm.put("java", 41.8);
		
		bm.put("py", 88.8);
		bm.put("C++", 44.8);
		
		System.out.println(bm);
		System.out.println(bm.size());
		System.out.println(bm.values());
		System.out.println(bm.getClass());
		
		System.out.println(bm.keySet());*/
		
		
	}

}

class Book1{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Book1 other = (Book1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	private String name;
	private double price;
	public Book1(String name, double price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		
		return name+","+price;
	}
	
		
	
	
}