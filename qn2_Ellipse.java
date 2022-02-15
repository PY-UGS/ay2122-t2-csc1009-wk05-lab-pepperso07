package Wk5qn2;

public class qn2_Ellipse extends qn2_Shape{
public qn2_Ellipse(double dim1,double dim2)
{
	super(dim1,dim2);
}

public double area()
{
	double a =getPI()*getDim1()*getDim2();
	a=Math.round(a*100)/100.0;
	return a;
}
}
