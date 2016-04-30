package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIO {

	public static void main(String[] args) throws IOException {
		
		File file = new File("G:"+File.separator+"kiljaeden.jpg");
		File newfile = new File("G:"+File.separator+"newfile.jpg");
		if(!newfile.getParentFile().exists()){
			newfile.getParentFile().mkdirs();
		}
		InputStream in = new FileInputStream(file);
		OutputStream out = new FileOutputStream(newfile);
		byte[] b = new byte[1024];
		int temp = 0;
		
		while((temp=in.read(b)) != -1){
			out.write(b, 0, temp);
		}
		out.close();
		in.close();
	}

}
