package DevelopModal;

import java.util.HashSet;

public class Observer {
	
	public static void main(String[] args) {
		product p = new product("abc", "23");
		Observers o1 = new WebObserver();
		Observers o2 = new MobelObserver();
		p.addObverser(o1);
		p.addObverser(o2);
		System.out.println("第一次修改信息=======>");
		p.setAge("4");
		o1.unreg(p);
		System.out.println("第2次修改信息=======>");
		p.setName("ccc");
		
	}

}

class product{
	private String name;
	private String age;
	private HashSet<Observers> observer;
	public product(String name, String age) {
		super();
		this.name = name;
		this.age = age;
		observer =  new HashSet<Observers>();
	}
	public void notifyObservers(){
		for(Observers ob:observer)
			ob.update(this);
	}
	public void addObverser(Observers ob){
		observer.add(ob);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		notifyObservers();
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
		notifyObservers();
	}
	public HashSet<Observers> getobserver() {
		return observer;
	}
	public void setobserver(HashSet<Observers> observer) {
		this.observer = observer;
	}
	
	
}

interface Observers{
	public void update(product p);
	public void unreg(product p);
}

class WebObserver implements Observers{

	@Override
	public void update(product p) {
		System.out.println("WebObserver..."+p.getName()+"=="+p.getAge());
		
	}

	@Override
	public void unreg(product p) {
		p.getobserver().remove(this);
		
	}
	
}

class MobelObserver implements Observers{

	@Override
	public void update(product p) {
		System.out.println("MobelObserver..."+p.getName()+"=="+p.getAge());
		
	}

	@Override
	public void unreg(product p) {
		p.getobserver().remove(this);
		
	}
	
}

