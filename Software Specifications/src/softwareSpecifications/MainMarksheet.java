package softwareSpecifications;

import java.util.Scanner;

public class MainMarksheet {
	private static Scanner scanner;

	public static void main(String args[]){
    scanner=new Scanner(System.in);
   	System.out.println("Enter no. of students :");
   	int noOfStudents=scanner.nextInt();
   	Marksheet m = new Marksheet();
   	int grades[]= m.enterMarks(noOfStudents);
   	
   	System.out.print("Average Of all grades : ");
   	float avg= (float) m.average(grades);
   	System.out.printf("%.2f \n", avg);
   	
   	System.out.print("Maximum Of all grades : ");
   	m.maximum(grades);
   	
   	System.out.print("Minimum Of all grades : ");
   	m.minimum(grades);
   	
   	System.out.print("Percentage Of students passed : ");
   	float per= (float)m.percentagePassed(grades);
   	System.out.printf("%.2f \n", per);
   	}
}