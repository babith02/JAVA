import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Server{
 public static void main(String[] args){
try{
   ServerSocket ss = new ServerSocket(8000);
   Socket s=ss.accept();
    System.out.println("Client Connected");
   DataInputStream FromClient = new DataInputStream(s.getInputStream());
   DataOutputStream ToClient =  new DataOutputStream(s.getOutputStream());
   Scanner in = new Scanner(System.in);
 while(true){
String msg="";
 msg=FromClient.readUTF();
 System.out.println("From Client: " + msg);
 System.out.print("To Client: ");
 msg=in.nextLine();
 ToClient.writeUTF(msg);
}
}catch(IOException e){
 e.printStackTrace();
}
}
}
   