import java.util.*;
import java.util.Scanner;
import java.lang.Math;
class armstrong{
	public static int len(String num){
		int i=0;
		char[] l= num.toCharArray();
		for(char it:l){
			i++;
		}
	return i;
	}
	public static void main(String args[]){
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String num = S.nextLine();
		int length = len(num);
		int res=0,i=0;
		char[] arr= num.toCharArray();
		do{
			 char ch = arr[i];
			int number = ch-48;
			res += Math.pow(number,length);	
			i++;
		}while(i<length);
		String num2 = String.valueOf(res);
		if(num.equals(num2))
			System.out.println("The armstrong number");
		else
			System.out.println("fails");

	}
}
