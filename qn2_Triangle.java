package Wk5qn2;

public class qn2_Triangle extends qn2_Shape{
public qn2_Triangle(double dim1,double dim2)
{
	super(dim1,dim2);
}

public double area()
{
	
	return ((getDim1()*getDim2())/2.0);
}
}
