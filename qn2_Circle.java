package Wk5qn2;

public class qn2_Circle extends qn2_Shape{
public qn2_Circle()
{
	
}

public qn2_Circle(double dim1,double dim2)
{
	super(dim1,dim2);
}

public double area()
{
	double a=getPI()*(getDim2()*getDim1());
	a=Math.round(a*100)/100.0;
	return a;
}
}
