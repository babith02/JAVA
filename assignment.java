import java.util.Scanner;
public class assignment{
	public static void main(String args[]){
		Scanner S = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = S.nextInt();
		System.out.print("+= : ");
		System.out.println(num1+=2);
		System.out.print("-= : ");
		System.out.println(num1-=2);
		System.out.print("*= : ");
		System.out.println(num1*=2);
		System.out.print("/= : ");
		System.out.println(num1/=2);
		System.out.print("%= : ");
		System.out.println(num1%=2);
		System.out.print("&= : "); 
		System.out.println(num1&=2);
		System.out.print("|= : ");
		System.out.println(num1|=2);
		System.out.print("<<= : ");
		System.out.println(num1<<=2);
		System.out.print(">>= : ");
		System.out.println(num1>>=2);
		System.out.print("^= : ");
		System.out.println(num1^=2);
		
	}
}
