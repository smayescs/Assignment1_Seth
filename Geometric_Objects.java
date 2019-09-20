package siucs008_ass1;


public class Geometric_Objects
{
	static double out;
	
	public static void square(double s){
		out = (s*s);
		System.out.print("Square area = " +out+ "\n");
	}
	public static void circ(double r){
		out = (Math.PI*r*r);
		System.out.print("Circle area = " +out+ "\n");
	}
	public static void rec(double a, double b){
		out = (a*b);
		System.out.print("Rectangle Area = " +out+ "\n");
	}
	public static void tri(double a, double b, double c){
		out = (a+b+c)*.5;
		System.out.print("Triangle area = " +out+ "\n");
	}
	public static void cube(double a){
		out = (a*a*a);
		System.out.print("Cube area = " +out+ "\n");
	}
	public static void main(String[] args){
		cube(4);
		circ(2);
		rec(3,5);
		square(8);
		tri(3,2,1);
	}
}


