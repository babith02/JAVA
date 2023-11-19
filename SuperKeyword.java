class SuperKeyword{
	public static void main(String args[]){
	child c=new child();
	c.display();
	}
}


class parent {
	int a=60;
	void print(){
		System.out.println("Inside parents's print ");
	}
}


class child extends parent{
	int a=10;
	void print(){
		System.out.println("Inside child's print ");
	}

	void display(){
		System.out.println("\nInside Child's Display ");
		System.out.println("\nValue of a in child class : "+a);

		System.out.println("Value of a in parent class : "+super.a);
		print();
		super.print();
	}
}
