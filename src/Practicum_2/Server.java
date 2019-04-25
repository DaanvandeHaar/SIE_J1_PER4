package Practicum_2;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        Scanner scanner = new Scanner(is);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        s.close();
        ss.close();

    }
}
