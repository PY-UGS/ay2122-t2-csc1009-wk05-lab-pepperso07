package Wk5Qn1;

public class qn1_Circle extends qn1_GeometricObject{
public double radius;
public qn1_Circle()
{
}

public qn1_Circle(double radius)
{
	this.radius=radius;
}

public qn1_Circle(double radius,String colour, boolean filled)
{
	super(colour,filled);
	this.radius=radius;
	
}

public double getRadius()
{
	return radius;
}

public void setRadius(double radius)
{
	this.radius=radius;
}

public double getArea()
{
	return (Math.PI*(radius*radius));
}

public double getPerimeter()
{
	return (2*(Math.PI)*radius);
}

public double getDiameter()
{
	return radius*2;
}

public void printCircle()
{
	
}
}
