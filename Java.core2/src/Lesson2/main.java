package Lesson2;

public class main {
	public static void main(String[]args) {
		
		Rectangle rectanglearea = new Rectangle();
//		int area = rectanglearea.length * rectanglearea.width;
//		System.out.println("Площа = "+area);
		System.out.println("Площа = "+rectanglearea.getArea());
		
		Rectangle rectanglearea2 = new Rectangle(8,6);
//		int square = (rectanglearea2.length + rectanglearea2.width) *2;
//		System.out.println("Периметер = "+square);
		System.out.println("Периметер = "+rectanglearea2.getPerimiter());
		
		
		Circle circleSquar = new Circle();
		System.out.println("Площа круга = "+circleSquar.getSquareCircle());
		System.out.println("Довжина круга = "+circleSquar.getLengthCircle());
	}
	
}
