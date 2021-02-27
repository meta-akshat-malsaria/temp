import java.util.HashMap;

public class ShoppingCart {
	HashMap<String,Integer> hashPrice= new HashMap<String,Integer>();
	HashMap<String,Integer> hashQuantity= new HashMap<String,Integer>();
	
	/**
	 * addToCart method is used to add an item to the cart
	 */
	public void addToCart(String nameOfItem ,int priceOfItem, int quantityOfItem){
		hashPrice.put(nameOfItem,priceOfItem);
		hashQuantity.put(nameOfItem,quantityOfItem);
	}
	
	/**
	 * updateCart method is used to update on to the quantity of an individual item.
	 */
	public void updateCart(String nameOfItem,int updatedQuantity){
		hashQuantity.replace(nameOfItem,updatedQuantity);
	}
	
	/**
	 * removeItem method is used to remove an item from the cart
	 */
	public void removeItem(String nameOfItem){ 
		hashPrice.remove(nameOfItem);
		hashQuantity.remove(nameOfItem);
	}
	
	/**
	 * billGenerate method is used to return the total bill.
	 */
	public int billGenerate(){
		int bill=0;
		HashMap<String,Integer> hashBill =new HashMap<String, Integer>();
		for(String key : hashPrice.keySet()){
			if(hashQuantity.containsKey(key)){
				hashBill.put(key, hashPrice.get(key) * hashQuantity.get(key));
			}
			bill +=hashBill.get(key);
		}
		return bill;
	}
	
}
