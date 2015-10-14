package com.m2i.formation.geometry;

public class Point
{

	private int x;
	private int y;
	
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	Point(int xOrigin,int yOrigin)
	{
		x = xOrigin;
		y = yOrigin;
	}
	Point()
	{
		x=0;
		y=0;
	}
	public void move(int newX,int newY)
	{
		//  Action 
		x = newX;
		y = newY;
	}
	
	public void display()
	{
		// Action
		System.out.println("("+x+";"+y+")");
	}	
}
