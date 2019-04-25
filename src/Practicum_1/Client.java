package Practicum_1;
import java.io.*;
import java.net.Socket;




public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("192.168.1.68" , 8080);
        OutputStream os = s.getOutputStream();
        os.write("hallo\n".getBytes());
        s.close();
    }
}
