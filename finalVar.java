import java.util.Scanner;
class finalVar
{
	public static void main(String args[])
	{
		Scanner inp=new Scanner(System.in);
		final double pi=3.14;
		double rad,res;
		System.out.print("Enter the radius:");
		rad=inp.nextDouble();
		res=pi*rad*rad;
		System.out.println("Area of circle:"+ res);
	}
}