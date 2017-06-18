package ClientServer;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		int num,result;
		Scanner sc=new Scanner(System.in);
		Socket s=new Socket("127.0.0.1",1234);//ip of local host and any random port
		System.out.println("Enter number so that it will be doubled: ");
		num=sc.nextInt();
		
		//now sending that num to server where number will be doubled and result is sent back
		PrintStream p=new PrintStream(s.getOutputStream());
		p.println(num);//num sent to server
		
		//getting result from server
		Scanner sc1=new Scanner(s.getInputStream());
		result=sc1.nextInt();
		System.out.println(result);
	}

}
