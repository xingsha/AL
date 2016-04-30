package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;


public class Client {
	
	

	public static void main(String[] args) throws  IOException {
		BufferedReader br=null;
		OutputStream os=null;
		Socket cs=null;
		cs = new Socket("localhost", 1299);
		try {
			os = cs.getOutputStream();
			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			int c;
			String msg="";
			
			while(true){
				while((c=System.in.read())!=-1){
					os.write(c);
					if(c=='\n'){
						os.flush();
						break;
					}
				}
				msg=br.readLine();
				System.out.println("Server:"+msg);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			br.close();
			os.close();
			cs.close();
		}
	}

}
