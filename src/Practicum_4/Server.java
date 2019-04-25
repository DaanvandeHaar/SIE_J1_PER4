package Practicum_4;

import javax.net.ssl.SSLSession;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import java.util.Scanner;

import static javax.security.auth.callback.ConfirmationCallback.OK;

public class Server {
    public static void main(String[] args) throws Exception {
    while(true) {
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();
        s.setKeepAlive(true);
        InputStream is = s.getInputStream();
        Scanner scanner = new Scanner(is);

        OutputStream os = s.getOutputStream();
        PrintWriter pw = new PrintWriter(os);


        System.out.println("Connection made");
        while (scanner.hasNextLine()) {
            System.out.println("Bericht: " + scanner.nextLine());
            if (scanner.nextLine().equals("")) {
                System.out.println("End of message");
                pw.write("HTTP/1.1 200 OK");
                pw.write("\r\n");
                pw.write("<h1>It works!</h1>");
                pw.flush();
                break;
            }

        }

        System.out.println("Connection terminated");
        s.close();
        ss.close();

    }
    }
}
