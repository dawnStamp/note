package ������;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class DownLoadUtil {

	public static void download(String urlString,String filename,String savePath) throws Exception{
		URL url = new URL(urlString);//����url����
		/*URLConnection con = url.openConnection();//������
		con.setConnectTimeout(5000);//��������ʱΪ5��(���Ǳ����)
		InputStream is = con.getInputStream();//��ȡ������*/
		
		
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
