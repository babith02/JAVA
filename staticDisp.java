class staticDisp{  
	int a=10;
	static int b=10; 
  
	staticDisp()
	{  
		a++;b++;
		System.out.println("Non static variable:"+a);  
		System.out.println("Static variable:"+b);
	}  
  
	public static void main(String args[])
	{  
		staticDisp c1=new staticDisp();  
		staticDisp c2=new staticDisp();  
	}  
} 