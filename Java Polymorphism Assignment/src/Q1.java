class Shape{
	private String color;
	
	public Shape(String color) {
		this.color=color;
	}
	@Override
	public String toString() {
		return "Color:"+color;
	}
	
	public double getArea() {
		System.out.println("Area not known");
		return 0;//Something to let the program run and later to be override by subclasses
	}
}


//Rectangle class inheriting Shape class
class Rectangle extends Shape{
	
	private int length;
	private int width;
	
	public Rectangle(String color, int length, int width) {
	
	super(color);
	this.length=length;
	this.width=width;
	
}

@Override
public String toString() {
	return "Rectangle of length: " + length +" and width:" + width;
	
}

@Override
public double getArea() {
	return length*width;
}

}

//Triangle class inheriting shape class
class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base=base;
		this.height=height;
	}
	
	@Override
	public String toString() {
		return "Triangle of base: " + base +"and height:" + height;
	}
	
	@Override
	public double getArea() {
		return 0.5*base*height;
	}
}
public class Q1 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle("Red",5,8);
		System.out.println(r);
		System.out.println("Area is: " +r.getArea());
		
		Shape t =new Triangle("Green", 10,5);
		System.out.println(t);
		System.out.println("Area is:" +t.getArea());
		

	}

}
