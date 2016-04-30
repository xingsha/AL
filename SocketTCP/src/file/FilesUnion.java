package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesUnion {

	public static void main(String[] args) throws IOException {
		Filemanager a = new Filemanager("a.txt", new char[]{'\n'});
		Filemanager b = new Filemanager("b.txt", new char[]{'\n',' '});
		
		FileWriter c = new FileWriter("c.txt");
		
		String aword = null;
		String bword = null;
		
		while((aword=a.nextWord())!=null){
			c.write(aword+"\n");
			bword = b.nextWord();
			if(bword!=null){
				c.write(bword+"\n");
			}
			
			while((bword=b.nextWord())!=null){
				c.write(bword+"\n");
			}
			c.close();
		}
	}

}

class Filemanager{
	String[] word = null;
	int pos;
	public Filemanager(String filename,char[] seperators) throws IOException {
		
		File f = new File(filename);
		FileReader reader = new FileReader(f);
		char[] buf = new char[(int)f.length()];
		int len = reader.read(buf);
		String result = new String(buf,0,len);
		String regex = null;
		
		if(seperators.length>1){
			regex = ""+seperators[0]+"|"+seperators[1];
		}else{
			regex = ""+seperators[0];
		}
		word = result.split(regex);
	}
	
	public String nextWord(){
		if(pos==word.length){
			return null;
		}
		return word[pos++];
	}
	
}