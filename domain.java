import java.io.*;
import java.util.Scanner;
class domain
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NAME: ");
		String firstname = s.nextLine();	
		System.out.println("ENTER THE LAST NAME: ");
		String lastname = s.nextLine();
		String domain="";
		int i=0,flag=0;
		for(i=0;i!=firstname.length() && flag!=3;i++)
		{
			domain+=firstname.charAt(i);
			flag++;
		}
		flag=0;
		for(i=0;i!=lastname.length() && flag!=3;i++)
		{
			domain+=lastname.charAt(i);
			flag++;
		}
		System.out.println("DOMAIN NAME: "+domain);
	}
}	