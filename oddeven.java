import java.util.*;
class oddeven{
	public static void main(String[] args){
		int n;
		System.out.print("Enter a number: ");
		Scanner S = new Scanner(System.in);
		n = S.nextInt();
		while(n>=0){
			if(n==1){
				System.out.print("Odd");
				break;
			}
			if(n==0){
				System.out.print("Even");
				break;
			}
			n-=2;
		}
	}
}