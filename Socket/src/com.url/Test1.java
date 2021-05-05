import org.junit.Test;
import java.net.*;
import java.io.*;
public class Test1 {
    public static void main(String[] args) {
        URL url = null;
        try {
             url =new  URL("http://localhost:8080");
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(url.getPort());//输出端口号！
    }
    /**
     * URL的名称：统一资源定位符，对应互联网中某一资源的地址
     * 
     */
    @Test
    public void URLTest(){
        
    }
}