package collectionTest;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Arraylist {

	public static void main(String[] args) {
		
		List<Book> c =  new Vector<Book>();
		c.add(new Book("java",67.3));
		c.add(new Book("C",34.6));
		c.add(new Book("C++",57.3));
		c.add(new Book("py",89.3));
		c.remove(new Book("py",89.3));
		System.out.println(c.size());
		/*for(int i=0;i<c.size();i++){
			System.out.println(c.get(i));
		}*/
		Iterator<Book> e = c.iterator();
		while(e.hasNext()){
			System.out.println(e.next());
		}
		
	}
	
}

class Book{
	private String name;
	private double price;
	public Book(String name, double price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		
		return "name:"+name+",price:"+price;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if (obj instanceof Book) {
			Book book = (Book)obj;
			if(book.name==name&&book.price==price)
				return true;
		}
		return false;
	}
}
