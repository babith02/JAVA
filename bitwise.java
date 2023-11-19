import java.util.Scanner;
public class bitwise{
	public static void main(String args[]){
		Scanner S = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = S.nextInt();
		System.out.print("Enter second number: ");
		int num2 = S.nextInt();
		System.out.print("Bitwise AND: ");
		System.out.println(num1 & num2);
		System.out.print("Bitwise OR: ");
		System.out.println(num1 | num2);
		System.out.print("Bitwise NOT: ");
		System.out.print(~num1);
		
	}
}