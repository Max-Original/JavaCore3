package Lesson2;

public class Circle {
	
	double radius;
	double diameter;
	
	Circle(){
	this.radius = 2.5;
	}
	Circle(double radius, double diameter){
		this.radius = radius;
		this.diameter = diameter;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public void setDiameter(double d) {
		diameter = d;
	}
	public double getRadius() {
		return radius;
	}
	public double getDiameter() {
		return diameter;
	}
	public double getSquareCircle() {
		return (radius*radius)*3.14;
	}
	public double getLengthCircle() {
		return (radius*2)*3.14;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
	}
	
}
