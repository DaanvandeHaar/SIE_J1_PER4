package Practicum_3;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
    public static void main(String[] args) throws Exception {
        while (true) {
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            Scanner scanner = new Scanner(is);
            System.out.println("Connection made");
                if (scanner.hasNextLine()) {

                    System.out.println("Bericht: " + scanner.nextLine());

            }

            System.out.println("Connection terminated");
            s.close();
            ss.close();
        }
    }
}

