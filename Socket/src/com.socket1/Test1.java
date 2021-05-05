import org.junit.Test;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Test1 {
    public static void main(String[] args) throws UnknownHostException {

    }
    @Test
    public void Test2() throws UnknownHostException{
        InetAddress inet = InetAddress.getLocalHost();//获取本地主机的ip地址
        System.out.println(inet);
    }
}