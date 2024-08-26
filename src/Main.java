import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws IOException {

        InetAddress IP = InetAddress.getByName("www.ocsaly.com");

        System.out.println("HOST ADDRESS        :" +IP.getHostAddress());
        System.out.println("CANONICAL HOST NAME : "+IP.getCanonicalHostName());
        System.out.println("HOST NAME           : "+IP.getHostName());

    }
}