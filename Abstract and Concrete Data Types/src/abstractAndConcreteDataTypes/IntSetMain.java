package abstractAndConcreteDataTypes;

import java.util.Scanner;



public class IntSetMain {
	private static Scanner scanner; 
	public static void main(String []args){
		int choice,size;
		scanner= new Scanner(System.in);
		System.out.println("Please enter the size of the set");
		size = scanner.nextInt();
		int setArray[] = new int[size];
		if(size!=0)
			System.out.println("Enter the set elements");
		for(int i=0;i<size;i++){
			try{
				int x = scanner.nextInt();
				if(x>1000){
					throw new OutofRangeException();
				}
				else{
					setArray[i] =x;
				}
			}catch(OutofRangeException e){
				System.out.println(e.getMessage());
			}
		}
	
		intSet set = new intSet(setArray,size);
		set.printSet();
		System.out.println("Please choose from the following options");
		System.out.println("1. Check Whether a particular element is present in the given Set or not.");
		System.out.println("2. Check the size of the Set");
		System.out.println("3. Check whether a particular set is Subset of the given set or not.");
		System.out.println("4. Complement of the given Set");
		System.out.println("5. Union of two sets (Entered set and a particular set");
		System.out.println("6. Exit");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			int element;
			System.out.println("Enter the element:");
			element = scanner.nextInt();
			System.out.println(set.isMember(element));
			break;
		case 2:
			System.out.println("Size of the set is: "+set.size());
			break;
		case 3:
			System.out.println("Enter the size of new set:");
			int newSetSize; 
			newSetSize = scanner.nextInt();
			int newSetArray[] = new int[newSetSize];
			if(newSetSize!=0)
				System.out.println("Enter the new Set elements");
			for(int i=0;i<newSetSize;i++)
				newSetArray[i] = scanner.nextInt();
			intSet newSet = new intSet(newSetArray,newSetSize);
			newSet.printSet();
			System.out.println(set.isSubSet(newSet));
			break;
		case 4:
			System.out.println("Original Set");
			set.printSet();
			intSet complement = set.getComplement();
			System.out.println("Complement of the given is:");
			complement.printSet();
			break;
		case 5:
			System.out.println("Enter the size of new set:");
			int newSetSize1; 
			newSetSize1 = scanner.nextInt();
			int newSetArray1[] = new int[newSetSize1];
			if(newSetSize1!=0)
				System.out.println("Enter the new Set elements");
			for(int i=0;i<newSetSize1;i++)
				newSetArray1[i] = scanner.nextInt();
			intSet newSet1= new intSet(newSetArray1,newSetSize1);
			newSet1.printSet();
			System.out.println("Union of the two Sets is");
			intSet union = set.union(newSet1);
			union.printSet();
			break;
		case 6:
			break;
		default:
			System.out.println("Please enter the correct choice");
		}
	}
}
