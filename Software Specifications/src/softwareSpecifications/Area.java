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
     * @param width side of square.
     * @return area of square.
     */ 
    public static double areaOfSquare(double width){
    	double area=width*width;
      	return area;
    }
	  
    /**
     * Calculates rea of Circle.
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
	double width=scanner.nextDouble();
	double height=scanner.nextDouble();
	System.out.println("Area Of Triangle is : "+areaOfTriangle(width,height));
		    
	System.out.println("Let's calculate area of RECTANGLE");
	System.out.print("Enter Width and Height :");
	width=scanner.nextDouble();
	height=scanner.nextDouble();
    System.out.println("Area Of Rectangle is : "+areaOfRectangle(width,height));
		    
    System.out.println("Let's calculate area of SQUARE");
	System.out.print("Enter Width :");
	width=scanner.nextDouble();
	System.out.println("Area Of Square is : "+areaOfSquare(width));
		    
    System.out.println("Let's calculate area of CIRCLE");
	System.out.print("Enter Radius :");
	double radius=scanner.nextDouble();
	System.out.println("Area Of Circle is : "+areaOfCircle(radius));
    }
}