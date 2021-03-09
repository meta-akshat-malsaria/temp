package junitTestAssignment;

import java.util.Scanner;

public class ArrOperations {
	private static Scanner scanner;
	
	public static int maxMirror(int[] arr){
		int max=1;
		try{
			if (arr.length==0){
				throw new AssertionError("Empty array");
			}
			else{
				for (int i = 0; i < arr.length; i++){
					int count=0;
					for (int j = arr.length-1; j>=i; j--){
						if(arr[i+count]!=arr[j]){
							break;
						}
						count++;
					}
					max=Math.max(max, count);
				}
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return max;
	}
	
	public static int countClumps(int[] arr){
		int count=0;
		try {
			if(arr.length==0){
				throw new AssertionError("Empty Array");
			}else{
				int num=-1;
				for (int i = 1; i < arr.length; i++) {
					if ((arr[i-1]==arr[i])&&(num!=arr[i-1])) {
						count++;
						num=arr[i];
					}
					else if ((arr[i-1]==arr[i])&&(num==arr[i-1])) {
						
					}
					else{
						num=-1;
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return count;
	}
	
	
	public static int[] fixXY(int arr[],int x,int y){
		if(arr.length<=0){
			throw new AssertionError("Empty array");
		}
		int n=arr.length;
		int yarr[]=new int[n/2];
		int j=0,k=0;
		for(int i=0;i<n;i++){
			if(arr[i]==y)
				yarr[j++]=i;
		}
		j--;
		for(int i=0;i<n-1;i++){
			if(arr[i]==x && arr[i+1]!=y && arr[i+1]!=x){
				if(k<=j){
				   arr[yarr[k++]]=arr[i+1];
				   arr[i+1]=y;
				}
				else
					throw new AssertionError("Unequal number of x and y");
				
			}
			else if(arr[i]==x && arr[i+1]==x)
				throw new AssertionError("Two adjacent x's");
			}
		if(arr[n-1]==x)
			throw new AssertionError("x at last index");
		return arr;
	}
	
	
	public static int splitArray(int[] arr){
		int k=-1;
		try {
			int sum=0;
			if(arr.length==0){
				throw new AssertionError("Empty array");
			}
			else{
				for (int i = 0; i < arr.length; i++) {
					sum=sum+arr[i];
					arr[i]=sum;
				}
				if(sum%2==0){
					for (int i = 0; i < arr.length; i++) {
						if(arr[i]==(sum/2)){
							k=i+1;
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return k;
	}
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter 1 to find largest mirror section size\n"
				+ "Enter 2 to find number of clumps in array\n"
				+ "Enter 3 to rearrange array as XY\n"
				+ "Enter 4 to find index of split array where sum of left right is equal\n"
				+ "Enter 5 to exit");
		int input=scanner.nextInt();
		switch (input) {
		case 1:
			System.out.println("Enter total no of elements in array");
			int total_num=scanner.nextInt();
			int[] arr=new int[total_num];
			System.out.println("Enter elements of array");
			for (int i = 0; i < total_num; i++) {
				arr[i]=scanner.nextInt();
			}
			int max=maxMirror(arr);
			System.out.println(max);
			break;
		case 2:
			System.out.println("Enter total no of elements in array");
			int total_num1=scanner.nextInt();
			int[] arr1=new int[total_num1];
			System.out.println("Enter elements of array");
			for (int i = 0; i < total_num1; i++) {
				arr1[i]=scanner.nextInt();
			}
			int clumps=countClumps(arr1);
			System.out.println(clumps);
			break;
		case 3:
			System.out.println("Enter total no of elements in array");
			int total_num2=scanner.nextInt();
			int[] arr2=new int[total_num2];
			System.out.println("Enter elements of array");
			for (int i = 0; i < total_num2; i++) {
				arr2[i]=scanner.nextInt();
			}
			System.out.println("Enter value of X");
			int x=scanner.nextInt();
			System.out.println("Enter value of Y");
			int y=scanner.nextInt();
			int[] fix_arr=fixXY(arr2,x,y);
			for (int i = 0; i < fix_arr.length; i++) {
				System.out.print(fix_arr[i]+" ");
			}
			System.out.println();
			break;
		case 4:
			System.out.println("Enter total no of elements in array");
			int total_num3=scanner.nextInt();
			int[] arr3=new int[total_num3];
			System.out.println("Enter elements of array");
			for (int i = 0; i < total_num3; i++) {
				arr3[i]=scanner.nextInt();
			}
			int split_index=splitArray(arr3);
			System.out.println(split_index);
			break;
		case 5:
			System.out.println("Good bye...");
			return;
		default:
			System.out.println("Wrong input, Try again.");
			break;
	}
}
}
