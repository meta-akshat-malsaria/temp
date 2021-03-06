package recursion;
import java.util.Scanner;
public class LcmHcf {
	private static Scanner scanner;
	public static int lcmCalculation(int n1,int n2){
		return (n1 / hcf(n1,n2)) * n2;
	}
	public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		System.out.println("Enter the two numbers");
        int n1 = scanner.nextInt();
        int n2 =  scanner.nextInt();
        int hcf = hcf(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
        System.out.println();

        int lcm=lcmCalculation(n1,n2);

        System.out.println("LCM of "+n1+" and "+n2+" is ="+lcm);
    }
}