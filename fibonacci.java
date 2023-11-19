import java.util.*;
import java.util.Scanner;
public class fibonacci{
	public static void main(String args[]){
		int a=1, b=1,c,n,i=2;
		Scanner S = new Scanner(System.in);
		System.out.print("Enter the number of elements in a fibonacci series: ");
		n = S.nextInt();
		System.out.print(a+"\n"+b+"\n");
		do{
			c=a+b;
			a=b;
			b=c;
			i++;
			System.out.print(c+"\n");
		}while(i<n);
	}
}