package softwareSpecifications;

import java.util.*;

/**
 * This class implements various operations on a string.
 * @author akshat.malsaria_meta
 * @version 1.0
 */
class StringOperations{
	private static Scanner scanner;
  
    /**
     * Check equality of two strings.
     * @param string1 
     * @param string2
     * @return 1 if strings are equal, else 0.
     */
    public static int compare(String string1, String string2){
    	int i=0;
      	if(string1.length()!=string2.length())
      		return 0;
      	for(i=0;i<string1.length();i++){
      		if(string1.charAt(i)!=string2.charAt(i))
      			return 0;
      	}
      	return 1;
    }
	
    /**
     * Reverses the string.	
     * @param str string to be reversed
     * @return reversed string
     */
    public static String reverse(String str){
    	char reverseString[]=new char[str.length()];
    	int k=0;
    	for(int i=str.length()-1;i>=0;i--){
    		reverseString[k++]=str.charAt(i);
    	}
    	return new String(reverseString);
    }
	
    /**
     * Replace lower case characters with upper case and vice-versa .	
     * @param str 
     * @return string after upper case and lower case exchange
     */
    public static String replace(String str){
    	String resultString="";
    	for(int i=0;i<str.length();i++){
    		if(str.charAt(i)>='a' && str.charAt(i)<='z')
    			resultString=resultString + (char)((int)str.charAt(i)-32);
    		else if(str.charAt(i)==' ')
    			resultString=resultString+" ";
    		else
    			resultString=resultString + (char)((int)str.charAt(i)+32);  
    	}
    	return resultString;
    }
	  
    /**
     * To find the largest word in the given string.
     * @param str string whose largest word id to find.
     * @return largest word of the string.
     */
    public static String largestWord(String str){
    	str+=" ";
    	ArrayList<String> words=new ArrayList<>();
    	String word="";
    	for(int i=0;i<str.length();i++){
    		if(str.charAt(i)!=' ')
    			word+=str.charAt(i);
    		else{
    			words.add(word);
    			word=""; 
    		}
    	}
    	String large=words.get(0);
    	for(int i=1;i<words.size();i++){
    		if(large.length()<=words.get(i).length()){
    			large=words.get(i);
    		}
    	}
    	return large;
    }
	  
    public static void main(String args[]){
    	scanner=new Scanner(System.in);
        System.out.println("Enter two Strings");
        String string1=scanner.nextLine();
        String string2=scanner.nextLine();
        System.out.println("Comparison of two strings : "+compare(string1,string2));
        System.out.println("Reverse of first String : "+reverse(string1));
        System.out.println("Enter String :");
        String str=scanner.nextLine();
        System.out.println("String after replacing lowercase to upercase and vice-versa : "+replace(str));
        System.out.println("Largest word in above string is : "+largestWord(str));
    }
}