import pack.Calculator;

class PackageEg{
	public static void main(String args[]){
		System.out.println("\nPackage\n");
		int a=10,b=5;
		Calculator C=new Calculator();
		System.out.println("Addition of a,b       : "+C.add(a,b));
		System.out.println("Subtraction of a,b    : "+C.sub(a,b));
		System.out.println("Multiplication of a,b : "+C.mul(a,b));
		System.out.println("Division of a,b       : "+C.div(a,b));
		System.out.println("Modulus of a,b        : "+C.mod(a,b));
	}
}