package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileIOTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		//向文件输出
		/*File file = new File("G:"+File.separator+"testIO.txt");
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		
		PrintStream ps = new PrintStream(new FileOutputStream(file));
		ps.print("hello printIO");
		ps.close();*/
		
		File file = new File("G:"+File.separator+"testIO.txt");
		Scanner scan = new Scanner(new FileInputStream(file));
		scan.useDelimiter("\n");
		/*File outer = new File("G:"+File.separator+"outer.txt");
		if(!outer.getParentFile().exists()){
			outer.getParentFile().mkdirs();
		}*/
		while(scan.hasNext()){
			System.out.println(scan.next());
		}
		scan.close();
	}

}
