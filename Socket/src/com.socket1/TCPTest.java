//import org.junit.Test;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.io.*;
//import java.net.*;
import org.junit.Test;
import org.junit.Test;

import java.io.*;
import java.net.*;

//
//public class Test1 {
//    @Test
//    public void getclint(){
//        Socket socket = null;
//        OutputStream os = null;
//        InetAddress intt = null;
//        try{
//            intt = InetAddress.getByName("127.0.0.1");
//            socket = new Socket(intt, 9908);
//            os = socket.getOutputStream();
//            os.write("我是客户端1号".getBytes());
//        }catch(IOException e){
//            e.printStackTrace();
//        }finally{
//            if(os!=null){
//                try {
//                    os.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(socket!=null){
//                try {
//                    socket.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//
//        }
//
//    }
//
//
//    @Test
//    public void setServer(){
//        ServerSocket ss = null;
//        Socket socket  = null;
//        InputStream is = null;
//        ByteArrayOutputStream baos = null;
//        try{
//            ss = new ServerSocket(9908);
//
//            socket = ss.accept();
//
//            is = socket.getInputStream();
//
//            baos = new ByteArrayOutputStream(); //里面有一个数组
//            byte []buffer = new byte[5];
//            int len;
//            while((len = is.read(buffer))!=-1){
//                //String str = new String(buffer,0,len);
//                baos.write(buffer,0,len);
//                //System.out.print(str);
//
//            }
//            System.out.println(baos.toString());
//
//
//        }catch(IOException e){
//            e.printStackTrace();
//        }finally{
//            if(is!=null)
//                try {
//                    is.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            if(socket!=null)
//                try {
//                    socket.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            if(ss!=null)
//                try {
//                    ss.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            if(baos!=null){
//                try {
//                    baos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}

import org.junit.Test;
import org.junit.Test;

import java.io.*;
import java.net.*;

public class TCPTest{
    @Test
    public void TcpTestclint() throws UnknownHostException, IOException{
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9900);
        OutputStream os = socket.getOutputStream();
        File file = new File("C:\\Users\\Michael Ning\\IdeaProjects\\Test\\src\\6.png");
        FileInputStream fis  =new FileInputStream(file);
        byte[] buffer = new byte[9];
        int len;
        while((len = fis.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        os.close();
        fis.close();
        socket.close();
    }
    @Test
    public void serverTcp() throws IOException{
        ServerSocket ss = new ServerSocket(9900);

        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        File file = new File("a.png");
        FileOutputStream fos = new FileOutputStream(file);
        byte[] buffer = new byte[9];
        int len;
        while((len = is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        ss.close();
        socket.close();
        fos.close();

    }

}

