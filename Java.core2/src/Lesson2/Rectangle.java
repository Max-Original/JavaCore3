package Lesson2;

public class Rectangle {

	int length;
	int width;
	
	
	Rectangle() {
		this.length = 5;
		this.width = 3;
	}
	
	Rectangle(int length , int width) {
		this.length = length;
		this.width = width;
	}
	
	public void setLength(int l) {
		length = l;
	} 
	public void setWidth(int w) {
		width = w;
	}

	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public int getArea() {
		return length * width;
	}
	public int getPerimiter() {
		return (length+width)*2;
	}
//	public void combine(Rectangle r2) {
//		
//	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	

	
	
}
	
