package Wk5Qn1;
import java.util.Date;
public class qn1_TestCircleRectangle {


	
	
	
	public static void main(String[] args) {
	
		qn1_Circle circle=new qn1_Circle(1);
		System.out.println("A circle "+circle.toString());
		System.out.println("Colour is: "+circle.getColour());
		System.out.println("Radius is: "+circle.getRadius());
		System.out.println("Area is: "+circle.getArea());
		System.out.println("Diameter is "+circle.getDiameter());
		
		qn1_Rectangle rectangle= new qn1_Rectangle(2,4);
		System.out.println("\nA Rectangle is: "+rectangle.toString());
		System.out.println("Area is: "+rectangle.getArea());
		System.out.println("Perimeter is "+rectangle.getPerimeter());
}
}
