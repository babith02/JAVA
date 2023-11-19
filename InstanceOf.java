class Parent{
}

class InstanceOf extends Parent{ 
	public static void main(String args[]){ 

		InstanceOf i=new InstanceOf(); 
		System.out.println("\ni instanceof InstanceOf : " +(i instanceof InstanceOf) );

		InstanceOf j=null ;
		System.out.println("\nj instanceof InstanceOf : " +(j instanceof InstanceOf) );

		//Cannot downcast this way, It will give error
		/* InstanceOf k=new Parent(); 
		System.out.println(k instanceof InstanceOf);
		*/ 

		//Compiles successfully but ClassCastException is thrown at runtime 
		try{
			InstanceOf k=(InstanceOf) new Parent(); 
			System.out.println(k instanceof InstanceOf );
		}catch(Exception e){}
		

		Parent p1=new InstanceOf (); 
		System.out.println("\np1 instanceof InstanceOf : " +(p1 instanceof InstanceOf) );
	} 
} 