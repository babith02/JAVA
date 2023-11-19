import java.util.Scanner;
public class ternary{
	public static void main(String args[]){
		Scanner S = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int num1 = S.nextInt();
		int num2 = S.nextInt();
		System.out.println("Enter your command(1-add,2-sub): ");
		int comm = S.nextInt();
		int add = num1 + num2;
		int sub = num1 - num2;
		int result = (comm == 1) ? add : sub;
		System.out.print("Result: " + result);
	}
}
