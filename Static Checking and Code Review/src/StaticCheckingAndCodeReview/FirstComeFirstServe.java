package StaticCheckingAndCodeReview;

import java.util.*;

/**
 * Implementation of Job Scheduling problem using FCFS approach.
 * @author akshat.malsaria_meta
 * @version 1.0
 */
class FirstComeFirstServe{
	private static Scanner scanner;
	
	/**
	 * Calculates completion Time of each process.
	 * @param arr stores arrival and burst time of processes.
	 * @param numberOfProcesses total number of processes.
	 * @param completionTime stores completion time of each process.
	 */
	public static void completionTimeCalculator(int[][] arr,int numberOfProcesses,int[] completionTime){
		completionTime[0]=arr[0][0]+arr[0][1];
		for(int i=1;i<numberOfProcesses;i++)
			completionTime[i]=completionTime[i-1]+arr[i][1];		
	}
	
	/**
	 * Calculates Turn Around Time of each process i.e. TAT = CT - AT
	 * @param arr arr stores arrival and burst time of processes.
	 * @param numberOfProcesses total number of processes.
	 * @param completionTime stores completion time of each process.
	 * @param turnAroundTime stores turnAroundTime time of each process.
	 */
	public static void turnAroundTimeCalculator(int[][] arr,int numberOfProcesses,int completionTime[],int turnAroundTime[]){
		for(int i=0;i<numberOfProcesses;i++){
			turnAroundTime[i]=completionTime[i]-arr[i][0];
		}	
	}
	
	/**
	 * Calculates Waiting Time of each process i.e. WT = TAT - BT
	 * @param arr stores arrival and burst time of processes.
	 * @param numberOfProcesses total number of processes.
	 * @param waitingTime stores waitingTime time of each process.
	 * @param turnAroundTime stores turnAroundTime time of each process.
	 */
	public static void waitingTimeCalculator(int[][] arr,int numberOfProcesses,int waitingTime[],int turnAroundTime[]){	
		for(int i=0;i<numberOfProcesses;i++){
			waitingTime[i]=turnAroundTime[i]-arr[i][1];
		}	
	}
	
	/**
	 * Calculates Average Waiting Time.
	 * @param numberOfProcesses total number of processes.
	 * @param waitingTime stores waitingTime time of each process.
	 */
	public static void avgWaitingTimeCalculator(int numberOfProcesses,int waitingTime[]){
		int totalWaitingTime=0;
		for(int i=0;i<numberOfProcesses;i++){
		  totalWaitingTime+=waitingTime[i];
		}
		int avgWaitingTime=totalWaitingTime/numberOfProcesses;
		System.out.println(avgWaitingTime);
	}
	
	/**
	 * Calculates the maximum waiting time from all the processes.
	 * @param numberOfProcesses
	 * @param waitingTime
	 */
	public static void maxWaitingTimeCalculator(int numberOfProcesses,int waitingTime[]){   
		int maxWaitingTime=0;
		for(int i=0;i<numberOfProcesses;i++){
		  if(waitingTime[i]>maxWaitingTime)
		    maxWaitingTime=waitingTime[i];
		}
		System.out.println(maxWaitingTime);
	}
	
	public static void main(String args[]){
		scanner=new Scanner(System.in);
		int arr[][]=new int[20][2]; //arr storing arrival and burst time of processes.
		System.out.println("Enter number of process : ");
		int numberOfProcesses=scanner.nextInt();
		int i;
		int completionTime[]=new int[numberOfProcesses];
		int turnAroundTime[]=new int[numberOfProcesses];
		int waitingTime[]=new int[numberOfProcesses];
		
		//Loop to take arrival and burst time of the processes as input from user.
		for(i=0;i<numberOfProcesses;i++){
			System.out.println(" Process " + (i+1) + ": \nArrival Time  Burst Time");
			int arrival=scanner.nextInt();
			int burst=scanner.nextInt();
			arr[i][0]=arrival;
			arr[i][1]=burst;
		}
		System.out.println(" Completion time"+"    "+"Turn Around Time"+"    "+"Waiting Time");

		completionTimeCalculator(arr,numberOfProcesses,completionTime);
		turnAroundTimeCalculator(arr,numberOfProcesses,completionTime,turnAroundTime);
		waitingTimeCalculator(arr,numberOfProcesses,waitingTime,turnAroundTime);
		
		for(i=0;i<numberOfProcesses;i++){
		   System.out.println("\t"+completionTime[i]+"\t"+"\t"+"  "+turnAroundTime[i]+"\t"+"\t"+"    "+waitingTime[i]);
		}
		
		System.out.println("Average Wiating Time:");
		avgWaitingTimeCalculator(numberOfProcesses,waitingTime);
		
		System.out.println("Max Wiating Time:");
		maxWaitingTimeCalculator(numberOfProcesses,waitingTime);	
	}
}