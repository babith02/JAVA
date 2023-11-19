import java.io.*;
class ib
{
	public static void main(String inval[]) throws IOException
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("ENTER NO.1:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("ENTER NO.2:");
		int b = Integer.parseInt(br.readLine());
		int c;
		c = a+b;
		System.out.println("Addition result is: "+c);
	}
}