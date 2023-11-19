import java.util.Scanner;

class Email
{
	public static int getLengthOfStringWithCharArray(String str)
 	{
  		int length=0;
  		char[] strCharArray=str.toCharArray();
  		for(char c:strCharArray)
  		{
   			length++;
  		}
  		return length;
 	}
	public static void main(String args[])
	{
		int countat = 0, countdot = 0;
		String email;
		boolean flag=true;
		int m=-1, n=-1;
		Scanner In = new Scanner(System.in);
		System.out.println("\nEnter Email ID: ");
		email = In.nextLine();
		if(!email.contains("@") || !email.contains(".")){
			flag = false;
		}
		char first = email.charAt(0);
		if(first < 'a' || first > 'z')
			flag = false;
		int length=getLengthOfStringWithCharArray(email);
		if(flag)
		{
			for(int i=0; i<length; i++)
			{
				if(email.charAt(i) != '@' && email.charAt(i) != '.' && (email.charAt(i) < 'a' || email.charAt(i) >'z')){
					flag = false;
					break;
				}
				if(email.charAt(i) == '@'){m=i;countat++;}
				if(email.charAt(i) == '.'){n=i;countdot++;}
			}	
			if(n<0 || m<3 || n<m || n-m-1 < 3 || n+2 >= email.length())
				flag = false;
			if(countat > 1 || countdot > 1)
				flag = false;
		}
		if(flag)
			System.out.println("\tValid Email Address");
		else
			System.out.println("\tInvalid Email Address");
	}
}