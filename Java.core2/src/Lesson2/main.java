package Lesson2;

public class main {
	public static void main(String[]args) {
		
		Rectangle rectanglearea = new Rectangle();
//		int area = rectanglearea.length * rectanglearea.width;
//		System.out.println("����� = "+area);
		System.out.println("����� = "+rectanglearea.getArea());
		
		Rectangle rectanglearea2 = new Rectangle(8,6);
//		int square = (rectanglearea2.length + rectanglearea2.width) *2;
//		System.out.println("��������� = "+square);
		System.out.println("��������� = "+rectanglearea2.getPerimiter());
		
		
		Circle circleSquar = new Circle();
		System.out.println("����� ����� = "+circleSquar.getSquareCircle());
		System.out.println("������� ����� = "+circleSquar.getLengthCircle());
	}
	
}
