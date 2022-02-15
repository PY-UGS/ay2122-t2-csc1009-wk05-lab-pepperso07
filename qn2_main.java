package Wk5qn2;

public class qn2_main {
public static void main(String[] args) {
	// TODO Auto-generated constructor stub
		 qn2_Rectangle r = new qn2_Rectangle(9, 5);
	     qn2_Triangle t = new qn2_Triangle(10, 8);
	     qn2_Circle c = new qn2_Circle(5, 5);
	     qn2_Ellipse e = new qn2_Ellipse(7, 7);
	     qn2_Square s = new qn2_Square(6, 6);
	     qn2_Shape figref;// this is OK, no object is created
	     figref = r;
	     System.out.print("Inside area for Rectangle.\n");
	     System.out.println("Area is " + figref.area());
	     figref = t;
	     System.out.print("Inside area for Triangle.\n");
	     System.out.println("Area is " + figref.area());
	     figref = c;
	     System.out.print("Inside area for Circle.\n");
	     System.out.println("Area is " + figref.area());
	     figref = e;
	     System.out.print("Inside area for Ellipse.\n");
	     System.out.println("Area is " + figref.area());
	     figref = s;
	     System.out.print("Inside area for Square.\n");
	     System.out.println("Area is " + figref.area());
}
	

}
