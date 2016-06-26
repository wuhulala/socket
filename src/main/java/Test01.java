import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author xueaohui
 */
public class Test01 {
    @Test
    public void testInetAddress() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("计算机名:"+address.getHostName());
        System.out.println("IP地址:" +address.getHostAddress());
    }
}
