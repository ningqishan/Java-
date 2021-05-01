import java.net.InetAddress;

public class App {
    public static void main(String[] args) throws Exception {
        InetAddress ip;
        ip = InetAddress.getLocalHost();//实例化对象，这个对象名字是ip
        String localname = ip.getHostName();//获取IP地址的主机名字
        String localip = ip.getHostAddress();//获取本机的ip地址
        System.out.println("主机名字："+localname);
        System.out.println("本机ip地址："+localip);
    }
}
