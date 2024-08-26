import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws IOException {

//       InetAddress IP = InetAddress.getByName("www.ocsaly.com");

//        System.out.println("HOST ADDRESS        :" +IP.getHostAddress());
//        System.out.println("CANONICAL HOST NAME : "+IP.getCanonicalHostName());
//        System.out.println("HOST NAME           : "+IP.getHostName());

        try{
            URL url = new URL("https://ocsaly.com");
            URLConnection myUrlConnection = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(myUrlConnection.getInputStream()));
            String myLine;
            while((myLine = br.readLine()) != null){
                System.out.println(myLine);
            }
            br.close();
        }catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}