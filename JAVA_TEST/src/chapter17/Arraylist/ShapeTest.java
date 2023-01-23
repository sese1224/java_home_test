package chapter17.Arraylist;

import java.util.ArrayList;



class Shape {
	
	void draw() {
		System.out.println("draw Shape");
	}
	
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	
	void circle() {
		System.out.println("원모양을 그립니다. ");
	}
}
	
	class Rectangle extends Shape{

		@Override
		void draw() {
			System.out.println("draw  Rectangle");
		}
		
		void Rectangle() {
			System.out.println("사각형을 그립니다. ");
		}
	}

		class Triangle extends Shape{

			@Override
			void draw() {
				System.out.println("draw  Triangle");
			}
			
			void Triangle() {
				System.out.println("삼각형을 그립니다. ");
			}
	
}
public class ShapeTest {
	//shape 와 shape를 상송받은 모든 클래스 타입이 사용하는 ArrayList
			ArrayList<Shape> sList = new ArrayList<Shape>();
	
	public static void main(String[] args) {
		
		ShapeTest sTest = new ShapeTest();
		System.out.println("------업캐스팅-----");//부모가 가지고 있는게 나옴
		sTest.addShape();//Shape sc = new Circle
		System.out.println("----다운캐스팅------");//자식이 가지고 있는게 나옴
		sTest.testCasting();
		
		
	}
	
	public void addShape() {
		sList.add(new Circle());//Circle s = new Circle();
		sList.add(new Triangle());
		sList.add(new Rectangle());
		
		for(Shape s:sList) {
			s.draw();
		}
	}
	public void testCasting() {
		for(int i =0;i<sList.size();i++) {
			Shape s = sList.get(i);//일단 부모(shape)타입으로 가져옴
			
			if(s instanceof Circle) {
				Circle c = (Circle)s;//다운캐스팅
				c.circle();
					
			}else if(s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;//다운캐스팅
				r.Rectangle();
					
			}else if(s instanceof Triangle) {
				Triangle t = (Triangle)s;//다운캐스팅
				t.Triangle();
					
			}else {
				System.out.println("지원되지 않는 타입입니다.");
			}
		}
	}
}

	
