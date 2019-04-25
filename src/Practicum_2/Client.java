package Practicum_2;
import java.io.*;
import java.net.Socket;




public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost" , 8080);
        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        pw.print("hey\n");
        pw.print("hallo\n");
        pw.flush();
        s.close();
    }
}