package methods;

public class AreaPerimeterOfCircle {
	
	double pi = 3.14;
	
	void areaOfCircle(double radius) {	
		double area =  pi * radius * radius;
		System.out.println("Area: "+area);
	}
	
	void perimeterOfCircle(double radius) {
		double per =  2 * pi * radius;
		System.out.println("Perimeter: "+per);
	}

	public static void main(String[] args) {
		AreaPerimeterOfCircle obj = new AreaPerimeterOfCircle();
		obj.areaOfCircle(5);
		obj.perimeterOfCircle(5);
	}

}
