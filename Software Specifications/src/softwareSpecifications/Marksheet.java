package softwareSpecifications;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Implementation of Marksheet.
 * @author akshat.malsaria_meta
 * @version 1.0
 */
public class Marksheet {
	private static Scanner scanner;
	
	/**
	 * Enter marks of students.
	 * @param noOfstudents number of students
	 * @return array of grades.
	 */
	public int[] enterMarks(int noOfstudents){
		int grades[]=new int[noOfstudents];
		scanner = new Scanner(System.in);
    	System.out.println("[Grades must be in range 0 to 100]");
        for(int i=0;i<noOfstudents;i++){
        	System.out.print("Enter student "+(i+1)+" grade : ");
        	int grade=scanner.nextInt();
        	if(grade>100 || grade<0){
        		System.out.println("Invalid grade!! Re-enter");
        		i=i-1;
        		continue;
        	}
        	grades[i]=grade; 
        }
        
        
        return grades;
	}
	
	/**
	 * Calculate average.
	 * @param grades stores all grades.
	 * @return average.
	 */
	public float average(int []grades){
    	int total=0;
    	for(int i=0;i<grades.length;i++){
    		total+=grades[i];
    	}
    	return (float)total/grades.length;
    }

	/**
	 * Find the maximum grade.
	 * @param grades stores all grades.
	 */
	public void maximum(int grades[]){
		Arrays.sort(grades);
		System.out.println(grades[grades.length-1]);
    }
	
	/**
	 * Find the minimum grade.
	 * @param grades grades stores all grades.
	 */
	public void minimum(int grades[]){
		Arrays.sort(grades);
		System.out.println(grades[0]);
    }

	/**
	 * Calculate the percentage of student passed.
	 * @param grades grades stores all grades.
	 * @return passed students percentage.
	 */
	public float percentagePassed(int grades[]){
    	int count=0;
    	for(int i=0;i<grades.length;i++){
    		if(grades[i]>=40)
    			count++;
    	}
    	return ((float)count/(float)grades.length)*100;
    }



	

	
}