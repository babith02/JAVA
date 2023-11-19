class parent{
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40; //default access modifier
	int get(){
		return b;
	}
}

class AccessModifiers{
	public static void main(String args[]){
		parent p=new parent();
		System.out.println("Accessing the default variable : "+p.d);
		System.out.println("Accessing the public variable : "+p.a);
		System.out.println("Accessing the protected variable : "+p.c);

		System.out.print("Accessing the private variable using getter method in parent class: "+p.get());
		
		
	}
}