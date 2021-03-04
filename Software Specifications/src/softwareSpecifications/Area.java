package softwareSpecifications;

import java.util.*;

/**
 * Class Area implements the calculation of area of different figure.
 * @author akshat.malsaria_meta
 * @version 1.0
 */
class Area{
	private static Scanner scanner;
	
	/**
     * Calculates area of Triangle.
     * Precondition :- Width and Height cannot be negative.
     * @param width of triangle.
     * @param height of triangle.
     * @return area of triangle.
     */
	public static double areaOfTriangle(double width, double height){
		double area=(width*height)/2;
      	return area;
    }
	  
	/**
     * Calculates area of Rectangle.
     * Precondition :- Width and Height cannot be negative.
     * @param width of rectangle.
     * @param height of rectangle.
     * @return area of rectangle.
     */  
    public static double areaOfRectangle(double width, double height){
    	double area=width*height;
      	return area;
    }
	  
    /**
     * Calculates area of Square.
     * Precondition :- Width cannot be negative.
     * @param width side of square.
     * @return area of square.
     */ 
    public static double areaOfSquare(double width){
    	double area=width*width;
      	return area;
    }
	  
    /**
     * Calculates area of Circle.
     * Precondition :- Radius cannot be negative.
     * @param radius of circle.
     * @return area of circle.
     */  
    public static double areaOfCircle(double radius){
    	double area=3.141*radius*radius;
      	return area;
    }
	  
    public static void main(String args[]){
    scanner=new Scanner(System.in);
	System.out.println("Let's calculate area of TRIANGLE");
	System.out.print("Enter Width and Height :");
	try{
	double width=scanner.nextDouble();
	double height=scanner.nextDouble();
	if(height<=0 || width<=0){
		throw new NegativeNumberException();
	}
	else{
		System.out.println("Area Of Triangle is : "+areaOfTriangle(width,height));
	}
	}catch(NegativeNumberException e){
		System.out.println(e.getMessage());
	}
	
	
	System.out.println("Let's calculate area of RECTANGLE");
	System.out.print("Enter Width and Height :");
	try{
    double length=scanner.nextDouble();
	double breadth=scanner.nextDouble();
	if(length<=0 || breadth<=0){
		throw new NegativeNumberException();
	}
	else{
		System.out.println("Area Of Rectangle is : "+areaOfRectangle(length,breadth));
	}
	}catch(NegativeNumberException e){
		System.out.println(e.getMessage());
	}
	
	
    System.out.println("Let's calculate area of SQUARE");
	System.out.print("Enter Side :");
	try{
	double side=scanner.nextDouble();
	if(side<=0){
		throw new NegativeNumberException();
	}
	else{
		System.out.println("Area Of Square is : "+areaOfSquare(side));
	}
	}catch(NegativeNumberException e){
		System.out.println(e.getMessage());
	}
	
	
    System.out.println("Let's calculate area of CIRCLE");
	System.out.print("Enter Radius :");
	try{
	double radius=scanner.nextDouble();
	if(radius<=0){
		throw new NegativeNumberException();
	}
	else{
		System.out.println("Area Of Circle is : "+areaOfCircle(radius));
    }
	}catch(NegativeNumberException e){
		System.out.println(e.getMessage());
	}
}
}