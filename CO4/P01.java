package Graphics;
import java.util.Scanner;
interface Area{
	void area();
}
class Rectangle implements Area{
	public void area(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght:");
		int l=sc.nextInt();
		System.out.println("Enter breadth:");
		int b=sc.nextInt();
		float a=l*b;
		System.out.println("Area:"+a);
	}
}
class Triangle implements Area{
	public void area(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base length:");
		int b=sc.nextInt();
		System.out.println("Enter height:");
		int h=sc.nextInt();
		float a=b*h/2;
		System.out.println("Area:"+a);
	}
}
class Square implements Area{
	public void area(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of a side:");
		int s=sc.nextInt();
		float a=s*s;
		System.out.println("Area:"+a);
	}
}
class Circle implements Area{
	public void area(){
		float pi=3.14f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		int r=sc.nextInt();
		float a=pi*r*r;
		System.out.println("Area:"+a);
	}
}
class P01{
	public static void main(String ar[]){
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Square s=new Square();
		Circle c=new Circle();
		System.out.println("Area of Rectangle");
		r.area();
		System.out.println();
		System.out.println("Area of Triangle");
		t.area();
		System.out.println();
		System.out.println("Area of Square");
		s.area();
		System.out.println();
		System.out.println("Area of Circle");
		c.area();
		
		
		
	}
}