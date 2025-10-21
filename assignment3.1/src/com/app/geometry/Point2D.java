package com.app.geometry;
import java.lang.Math;

public class Point2D{
	private double x;
	private double y;
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	public String getDetail() {
		return "(x,y):" + x + " " + y ;
	}
	
	public boolean isEqual(Point2D p1, Point2D p2) {
		if(p1.x == p2.x && p1.y == p2.y) {
			return true;
		}
		else 
			return false;
	}
	
	public double calculateDistance(Point2D p1, Point2D p2) {
		double distance = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
		return distance;
	}
}
