package Wk5qn2;

abstract class qn2_Shape {
private double dim1,dim2;
private double PI;
 

public qn2_Shape()
{
}

public qn2_Shape(double dim1,double dim2)
{
   this.setPI(Math.PI);
   this.setDim1(dim1);
   this.setDim2(dim2);
  
}

public abstract double area();

public double getDim1() {
	return dim1;
}

public void setDim1(double dim1) {
	this.dim1 = dim1;
}

public double getDim2() {
	return dim2;
}

public void setDim2(double dim2) {
	this.dim2 = dim2;
}

public double getPI() {
	return PI;
}

public void setPI(double PI) {
	this.PI = PI;
}






}
