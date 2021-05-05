import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.*;
import java.net.*;

public class SocketTest2 {
    @Test
    public void getclint(){
        Socket socket = null;
        OutputStream os = null;
        InetAddress intt = null;
        try{
            //创建socket对象，指明服务器的ip和端口号
            intt = InetAddress.getByName("127.0.0.1");
            socket = new Socket(intt, 9908);

            os = socket.getOutputStream();
            os.write("我是客户端一号！".getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
                
            
        }

    }


    @Test
    public void setServer(){
        ServerSocket ss = null;
        Socket socket  = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try{
            //创建服务器端的socket，指明自己的端口号
            ss = new ServerSocket(9908);

            //调用accept方法，接受来自客户端的数据
            socket = ss.accept();
    
            is = socket.getInputStream();

            //读入输入流当中的数据
            baos = new ByteArrayOutputStream(); //里面有一个数组
            byte []buffer = new byte[5];
            int len;
            while((len = is.read(buffer))!=-1){
                //String str = new String(buffer,0,len);
                baos.write(buffer,0,len);
                //System.out.print(str);
                
            }
            System.out.println(baos.toString());

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(is!=null)
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(socket!=null)
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(ss!=null)
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/**
 * 以上程序的内容是：
 * 客户端像服务器端发送请求，服务器端接受请求，并且在控制台上输出
 */
