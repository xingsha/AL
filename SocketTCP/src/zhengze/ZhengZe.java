package zhengze;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ZhengZe implements Serializable{
	/**
	 * 
	 */
	private transient String title;
	private String author;
	private static final long serialVersionUID = 7435943333644300760L;

	public ZhengZe(String title, String author) {
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		
		return this.author+","+this.title;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		/*String str = "67.802";
		String regex = ".+";
		Pattern pattern = Pattern.compile(regex);
		String[] cs = pattern.split(str);
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.matches());*/
		dser();
	}
	
	public static void ser() throws FileNotFoundException, IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				new File("G:"+File.separator+"serializable.ser")));
		oos.writeObject(new ZhengZe("java开发","Thmos"));
		//oos.writeObject(new ZhengZe("C++开发","CVS"));
		oos.close();
		
	}
	public static void dser() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"G:"+File.separator+"serializable.ser"));
		Object obj = in.readObject();
		in.close();
		ZhengZe zz = (ZhengZe)obj;
		System.out.println(zz);
	}
}
