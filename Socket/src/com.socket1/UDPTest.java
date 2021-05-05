import org.junit.Test;

import java.io.IOException;
import java.net.*;

public class UDPTest {
    @Test
    //发送端
    public void UDPTe() throws IOException {
        DatagramSocket socket = new DatagramSocket();//UDP特有的方法
        String str = "我想发送导弹！";
        byte[]data = str.getBytes();
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data,0,data.length,inet,9090); //封装数据报
        socket.send(packet); //将数据报发出去
        socket.close(); //关闭socket
    }
    @Test
    public void receive() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] buffer = new byte[90];

        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

        socket.receive(packet); //接收数据

        System.out.print(new String(packet.getData(),0,packet.getLength()));

        socket.close();
    }
}
