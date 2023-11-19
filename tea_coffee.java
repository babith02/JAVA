import java.util.*;
import java.util.Scanner;
class tea_coffee{
	public static void main(String args[]){
		Scanner S = new Scanner(System.in);
		char sol;
		int flag=1;
		do{
			flag=0;
			System.out.println("\na-Tea\nb-coffee\nc-juice\nd-quit");
			System.out.println("Enter your choice: ");
			String num = S.nextLine();
			switch(num){
				case "a":
					System.out.println("Your Tea is Ready :) !");
					flag=1;
					break;
				case "b":
					System.out.println("Your Coffee is Ready :) !");
					flag=1;
					break;
				case "c":
					System.out.println("Your Juice is Ready :) !");
					flag=1;
					break;
				case "d":
					System.exit(0);
			}
			
		}while(flag==1);
	}
}









	