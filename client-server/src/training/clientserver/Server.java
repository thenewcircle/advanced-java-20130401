package training.clientserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Throwable {
		ServerSocket server = new ServerSocket(31337);
		Socket client = server.accept();
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		System.out.println(in.readLine());
		client.close();
		server.close();
	}

}