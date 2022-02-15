package Wk5Qn1;

import java.util.Date;

public class qn1_GeometricObject {
	// private String colour;
	//private boolean filled;
	//private Date dateCreated;
	
	 protected String colour;
	 protected  boolean filled;
	 protected  Date dateCreated;
	
	public qn1_GeometricObject()
	{
		 this.colour="white";
		 this.filled=false;
		 this.dateCreated=new Date();
	}
	
	public qn1_GeometricObject(String colour,boolean filled)
	{
		this.colour=colour;
		this.filled=filled;
	}
	
	public String getColour()
	{
		return colour;
		
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	
	public boolean isFilled()
	{
		return filled;
		
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated)
	{
		this.dateCreated=dateCreated;
	}
	
	
	public String toString()
	{
		return "Created on "+dateCreated+"\n Colour: "+colour+" and Filled: "+filled;
		
		
	}
	
}
