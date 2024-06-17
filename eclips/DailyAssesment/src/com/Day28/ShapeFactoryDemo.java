package com.Day28;

public class ShapeFactoryDemo {
	interface Shape{
		void draw();
	}
	static class Circle implements Shape{
		@Override
		public void draw() {
			System.out.println("Drawing a circle");
		}
		
	}
	static class Square implements Shape{
		@Override
		public void draw() {
			System.out.println("Drawing a Square");
		}
		
	}
	
	static class Ractangle implements Shape{
		@Override
		public void draw() {
			System.out.println("Drawing a Ractangle");
		}
		
	}
	
	static class ShapeFactory{
		Shape getShape(String shapeType) {
			if(shapeType==null) {
				return null;
			}
			if(shapeType.equalsIgnoreCase("Circle")){
				return new Circle();
			}
			else if (shapeType.equalsIgnoreCase("Square")) {
				return new Square();
				
			}
			else if (shapeType.equalsIgnoreCase("Ractangle")) {
				return new Ractangle();
				
			}
			return null;
		}
	}

	public static void main(String[] args) {
		ShapeFactory saFactory=new ShapeFactory();
		Shape shape1=saFactory.getShape("Circle");
		shape1.draw();
		Shape shape2=saFactory.getShape("SQUARE");
		shape2.draw();
		Shape shape3=saFactory.getShape("RACTANGLE");
		shape3.draw();
		

	}

}
