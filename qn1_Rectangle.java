package Wk5Qn1;

public class qn1_Rectangle extends qn1_GeometricObject{
public double width,height;

public qn1_Rectangle()
{
}

public qn1_Rectangle(double width,double height)
{
	this.width=width;
	this.height=height;
}

public qn1_Rectangle(double width,double height,String colour,boolean filled)
{
	super(colour,filled);
	this.width=width;
	this.height=height;
}

public double getWidth()
{
	return width;
}
public void setWidth(double width)
{
	this.width=width;
}

public double getHeight()
{
	return height;
}

public void setHeight(double height)
{
	this.height=height;
}

public double getArea() {
	
	return height*width;
}

public double getPerimeter()
{
	return (height*2)+(width*2);
}

}
