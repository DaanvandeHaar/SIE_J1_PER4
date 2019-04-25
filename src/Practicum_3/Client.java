package Practicum_3;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost" , 8080);
        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        Scanner scanner = new Scanner(System.in);
        String bericht = scanner.nextLine();
        pw.print(bericht);
        pw.flush();
        s.close();
    }
}
