import java.util.*;
class palindrome{
	public static void main(String[] args){
		int n, n2, sum=0;
		System.out.print("Enter a number: ");
		Scanner S = new Scanner(System.in);
		n = S.nextInt();
		n2 = n;
		do{
			int temp = n2%10;
			sum *= 10;
			sum += temp;
			n2 /= 10;
		}while(n2>0);
		if(n==sum)
			System.out.print("Palindrome");
		else
			System.out.print("fails");
	}
}