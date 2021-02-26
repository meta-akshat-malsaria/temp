import java.util.Scanner;


public class Main {
	private static Scanner scanner;

	public static void main(String[] args) {
		ShoppingCart s= new ShoppingCart();
		String i_name;
		int i_price,i_quantity;
		
		System.out.println("Press 1 to add an item to the cart.");
		System.out.println("Press 2 to update an item of the cart.");
		System.out.println("Press 3 to remove an item from the cart.");
		System.out.println("Press 4 to generate the bill.");
		scanner = new Scanner(System.in);
		while(true){
			System.out.print("Enter your choice:");
			int choice =scanner.nextInt();
			switch(choice){
			case 1:
				System.out.print("Enter Item name:");
				i_name =scanner.next();
				System.out.print("Enter Item price:");
				i_price =scanner.nextInt();
				System.out.print("Enter Item quantity:");
				i_quantity =scanner.nextInt();
				s.addToCart(i_name, i_price, i_quantity);
				break;
			
			case 2:
				System.out.print("Enter Item name:");
				i_name =scanner.next();
				System.out.print("Enter updated quantity:");
				i_quantity =scanner.nextInt();
				s.updateCart(i_name, i_quantity);
				break;
			
			case 3:
				System.out.print("Enter Item name to be removed:");
				i_name =scanner.next();
				s.removeItem(i_name);
				break;
			
			case 4:
				System.out.println("Your bill amount is "+s.billGenerate());
				return;
				
			
			}
		}
	}
}