package StaticCheckingAndCodeReview;

import java.util.*;

/**
 * This class implements nummber of operations on Hexadecimal number.
 * @author akshat.malsaria_meta
 * @version 1.0
 */
class HexCalc{
	private static Scanner scanner;
	
	/**
	 * Add two hexadecimal numbers.
	 * @param str1 First hexadecimal number.
	 * @param str2 Second hexadecimal number.
	 * @return Sum of two hexadecimal numbers.
	 */
	 public static String add(String str1,String str2){
		int num1=Integer.parseInt(str1,16); //gives decimal equivalent of the string str1
		int num2=Integer.parseInt(str2,16);
		return Integer.toHexString(num1+num2);
	 }
	
	 /**
	  * Subtracts two hexadecimal numbers.
	  * @param str1 First hexadecimal number.
	  * @param str2 Second hexadecimal number.
	  * @return Difference of two hexadecimal number.
	  */
	 public static String subtract(String str1,String str2){
		int num1=Integer.parseInt(str1,16);
		int num2=Integer.parseInt(str2,16);
		if(num1>num2)
		 return Integer.toHexString(num1-num2);
		else
		 return Integer.toHexString(num2-num1);
	 }
	
	 /**
	  * Multiply two hexadecimal numbers.
	  * @param str1 First hexadecimal number.
	  * @param str2 Second hexadecimal number.
	  * @return Multiplication of two hexadecimal number.
	  */
	 public static String multiply(String str1,String str2){
			int num1=Integer.parseInt(str1,16);
			int num2=Integer.parseInt(str2,16);
			return Integer.toHexString(num1*num2);
	 }
	 
	 /**
	  * Divide two hexadecimal numbers.
	  * @param str1 First hexadecimal number.
	  * @param str2 Second hexadecimal number.
	  * @return Division of two hexadecimal number.
	  */
	 public static String divide(String str1,String str2){
		int num1=Integer.parseInt(str1,16);
		int num2=Integer.parseInt(str2,16);
		return Integer.toHexString(num1/num2);
	 }
	 
	 /**
	  * Compare equality of two hexadecimal number.
	  * @param str1 First hexadecimal number.
	  * @param str2 Second hexadecimal number.
	  * @return Either True if equal and False if not equal.
	  */
	 public static boolean equalCompare(String str1,String str2){
		if(str1.compareTo(str2)==0)
			return true;
		else
		    return false;
	 }
	 
	 /**
	  * Compare two hexadecimal number and tells which is greater.
	  * @param str1 First hexadecimal number.
	  * @param str2 Second hexadecimal number.
	  * @return True if First number is greater than Second and False if
	  * Second number is greater than First.
	  */
	 public static boolean greaterCompare(String str1,String str2){
		if(str1.compareTo(str2)>0)
			return true;
		else
		    return false;
     }
	 
	 /**
	  * Compare two hexadecimal number and tells which is lesser.
	  * @param str1 First hexadecimal number.
	  * @param str2 Second hexadecimal number.
	  * @return True if First number id lesser than Second and False if 
	  * Second number is lesser than First. 
	  */
	 public static boolean lessCompare(String str1,String str2){
		if(str1.compareTo(str2)<0)
			return true;
		else
		    return false;
	 }
	 
	 /**
	  * Convert Hexadecimal number to Decimal number.
	  * @param str Hexadecimal string to be converted.
	  * @return Decimal equivalent of hexadecimal number.
	  */
	 public static int hexadecimalToDecimal(String str){
	 	return Integer.parseInt(str,16);
	 }
	 
	 /**
	  * Convert Decimal number to Hexadecimal number.
	  * @param num Decimal number to be converted.
	  * @return Hexadecimal equivalent of Decimal number.
	  */
	 public static String decimalToHexadecimal(int num){
	 	return Integer.toHexString(num);
	 }
	 
	 public static void main(String args[]){
		scanner = new Scanner(System.in);
		int choice=0;
		System.out.println("Enter two Hexadecimal Numbers : ");
		String str1=scanner.nextLine();
		String str2=scanner.nextLine();
		System.out.println("1. Add"+"\n"+"2. Subtract"+"\n"+"3. Multiply"+"\n"+"4. Divide"+"\n"+"5. Equal or not"+"\n"+"6. First greater than second or not"+"\n"+"7. First less than second or not"+"\n"+"8. Decimal Represrentation of Hexadecimal number"+"\n"+"9. Hexadecimal Represrentation of Decimal number."+"\n"+"10. Done!"+"\n");
		do{
			choice=scanner.nextInt();
			switch(choice){
				case 1:
					System.out.println("Addition is :  "+add(str1,str2));
					break;
					         
				case 2:
					System.out.println("Subtraction is :  "+subtract(str1,str2));
					break;
					         
				case 3:
					System.out.println("Multiplication is :  "+multiply(str1,str2));
					break;
					         
				case 4:
					System.out.println("division is :  "+divide(str1,str2));
					break;
					         
				case 5:
					System.out.println("Status of Equality :  "+equalCompare(str1,str2));
					break;
					         
				case 6:
					if(greaterCompare(str1,str2)==true)
						System.out.println("First number is greater than first");
					else
			         	System.out.println("Second number is greater than second");
					break;
					         
				case 7:
					if(lessCompare(str1,str2)==true)
						System.out.println("First number is less than first");
					else
			         	System.out.println("Second number is less than second");
					break;
					         
		    	case 8:
		    		scanner.nextLine();
		    		System.out.println("Enter Hexadecimal number to convert in Decimal number");        
		    		String str=scanner.nextLine();
		    		System.out.println("Decimal Representation is :  "+hexadecimalToDecimal(str));
		    		break;
					         
				case 9:
					System.out.println("Enter Decimal number to convert in Hexadecimal number");        
					int num=scanner.nextInt();
					System.out.println("Hexadecimal Representation is :  "+decimalToHexadecimal(num));
					break;
					          
				case 10: 
					System.out.println("Thanks For Using !!");
					break;
					                         
				default:
					System.out.println("Invalid Choice");
			}
		} while(choice!=10);
	}
}