package 网络编程;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class DownLoadUtil {

	public static void download(String urlString,String filename,String savePath) throws Exception{
		URL url = new URL(urlString);//创建url对象
		/*URLConnection con = url.openConnection();//打开连接
		con.setConnectTimeout(5000);//设置请求超时为5秒(不是必须的)
		InputStream is = con.getInputStream();//获取输入流*/
		
		
		InputStream is = url.openStream();
		
		byte[] by = new byte[1024];
		File file = new File(savePath);
		
		System.out.println(file.getPath());
		FileOutputStream os= new FileOutputStream(file.getPath()+"/"+filename);
		
		int len = 0;
		while((len=is.read(by))!=-1){
			os.write(by,0,len);
		}
		
		is.close();
		os.close();
		
	}
}
