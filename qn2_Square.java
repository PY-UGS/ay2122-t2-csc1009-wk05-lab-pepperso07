package Wk5qn2;

public class qn2_Square extends qn2_Shape{
	public qn2_Square(double dim1,double dim2)
	{
		super(dim1,dim2);
	}

	public double area()
	{
		return getDim1()*getDim2();
		 
	}
}
