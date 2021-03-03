package softwareSpecifications;

import java.util.*;

/**
 * Implementation of Marksheet.
 * @author akshat.malsaria_meta
 * @version 1.0
 */
class Marksheet{
	private static Scanner scanner;
	
	/**
	 * Calculates average of all grades.
	 * @param grades stores grades of student.
	 * @return average.
	 */
    public static float average(int grades[]){
    	int total=0;
    	for(int i=0;i<grades.length;i++){
    		total+=grades[i];
    	}
    	return (float)total/grades.length;
    }
    
    /**
     * To find maximum of all grades.	  
     * @param grades stores grades of student.
     * @return maximum grade.
     */
    public static int maximum(int grades[]){
    	return grades[grades.length-1];
    }
    
    /**
     * To find minimum of all grades.
     * @param grades stores grade of student.
     * @return minimum grade.
     */
    public static int minimum(int grades[]){
    	return grades[0];
    }
    
    /**
     * Calculate percentage of students passed.	  
     * @param grades stores grade of student.
     * @return percentage of Student passed.
     */
    public static float percentagePassed(int grades[]){
    	int count=0;
    	for(int i=0;i<grades.length;i++){
    		if(grades[i]>=40)
    			count++;
    	}
    	return ((float)count/(float)grades.length)*100;
    }
	  
    public static void main(String args[]){
    	scanner=new Scanner(System.in);
    	System.out.println("Enter no. of students :");
    	int noOfStudents=scanner.nextInt();
    	int grades[]=new int[noOfStudents];
    	System.out.println("[Grades must be in range 0 to 100]");
        for(int i=0;i<noOfStudents;i++){
        	System.out.print("Enter student "+(i+1)+" grade : ");
        	int grade=scanner.nextInt();
        	if(grade>100 || grade<0){
        		System.out.println("Invalid grade!! Re-enter");
        		i=i-1;
        		continue;
        	}
        	grades[i]=grade;
        }
        Arrays.sort(grades);
        System.out.print("Average Of all grades : ");
        System.out.printf("%.2f \n", average(grades));
        System.out.println("Maximum Of all grades : " + maximum(grades));
        System.out.println("Minimum Of all grades : " + minimum(grades));
        System.out.print("Percentage Of students passed : ");
        System.out.printf("%.2f ",percentagePassed(grades));
        System.out.print("%");
    }
}