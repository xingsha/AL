package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {

	public static void main(String[] args) throws InterruptedException {
		OutputStream os=null;
		BufferedReader br=null;
		Socket client=null;
		ServerSocket ss=null;
		try {
			ss = new ServerSocket(1299);
			System.out.println("==============Server started===============");
			System.out.println(ss.getLocalSocketAddress());
		
			int c;
			String msg="";
			boolean flag=true;
			
			
			while(flag){
				client=ss.accept();
				br=new BufferedReader(new InputStreamReader(client.getInputStream()));
				os=client.getOutputStream();
				
				while((msg=br.readLine())!=null){
					if(msg=="stop"){
						flag=false;
						break;
					}
					System.out.println("client:"+msg);
					while((c=System.in.read())!=-1){
						os.write(c);
						if(c=='\n'){
							os.flush();
							break;
						}
					}
					Thread.sleep(1);
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				br.close();
				os.close();
				ss.close();
				client.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}

	}

}
