
import java.util.*;
public class Circle1 {
		
	final double pi=3.14;
	
	void calArea(int r) {
		
		double area=pi*r*r;
		System.out.println("area is:"+area);
	}
	void calCircumference(int r){
		
		double circumference=2*pi*r;
		System.out.println("Circumference is:"+circumference);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  radius");
		int r=sc.nextInt();
		
		Circle1 c1=new Circle1();
		c1.calArea(r);
		c1.calCircumference(r);
	}

}

