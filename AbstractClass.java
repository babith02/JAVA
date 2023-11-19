abstract class Shape {
	abstract void area(double b, double h);
}


class Triangle extends Shape {
	void area(double base, double height){
		double area=0.5* base*height;
		System.out.println("\nArea of the Triangle is :="+area);
	}
}


class Rectangle extends Shape {
 	void area(double length, double breadth){
		double area=length*breadth;
		System.out.println("\nArea of the Rectangle is :="+area);
	}
}


class AbstractClass{
 	public static void main(String[] args){
		Rectangle r =new Rectangle();
		r.area(1.2,3.4);
		Triangle t =new Triangle();
		t.area(1.2,3.4);
	 }
}