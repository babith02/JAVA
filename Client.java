import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client{
 public static void main(String[] args){
try{
   Socket s = new Socket("localhost",8000);
   DataInputStream FromServer = new DataInputStream(s.getInputStream());
   DataOutputStream ToServer =  new DataOutputStream(s.getOutputStream());
   Scanner in = new Scanner(System.in);
while(true){
 String msg="";
 System.out.print("To Server: ");
 msg=in.nextLine();
 ToServer.writeUTF(msg);
 msg=FromServer.readUTF();
 System.out.println("From Server: " + msg);
 
}
}
catch(IOException e){
  e.printStackTrace();
}
}
}
   