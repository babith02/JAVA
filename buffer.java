import java.io.*;
class buffer{
	public static void main(String inputval[]) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.print("Enter your name: ");
		String name = br.readLine();
		System.out.println("Enter two numbers: ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int sum = num1 + num2;
		System.out.println(name + "! your answer is " + sum);
	}
}