package ClientServer;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num,temp;
		ServerSocket ss=new ServerSocket(1234);//port num which we have given in client
		Socket s=ss.accept();//which accepts request from client
		Scanner sc=new Scanner(s.getInputStream());
		num=sc.nextInt();
		temp=num*2;
		PrintStream p=new PrintStream(s.getOutputStream());
		p.println(temp);
	}

}
