import java.util.HashMap;
/**
 * This is the simple implementation of Shopping Cart.
 * @author akshat.malsaria_meta
 * @version 1.0
 */
public class ShoppingCart {
	HashMap<String,Integer> hashPrice= new HashMap<String,Integer>();
	HashMap<String,Integer> hashQuantity= new HashMap<String,Integer>();
	
	/**
	 * addToCart method is used to add an item to the cart
	 * @param nameOfItem Name of item added.
	 * @param priceOfItem Price of item added.
	 * @param quantityOfItem Quantity of item added.
	 */
	public void addToCart(String nameOfItem ,int priceOfItem, int quantityOfItem){
		hashPrice.put(nameOfItem,priceOfItem);
		hashQuantity.put(nameOfItem,quantityOfItem);
	}
	
	/**
	 * updateCart method is used to update on to the quantity of an individual item.
	 * @param nameOfItem Name of item to be updated.
	 * @param updatedQuantity Updated quantity of the item.
	 */
	public void updateCart(String nameOfItem,int updatedQuantity){
		hashQuantity.replace(nameOfItem,updatedQuantity);
	}
	
	/**
	 * removeItem method is used to remove an item from the cart.
	 * @param nameOfItem Name of item to be removed.
	 */
	public void removeItem(String nameOfItem){ 
		hashPrice.remove(nameOfItem);
		hashQuantity.remove(nameOfItem);
	}
	
	/**
	 * billGenerate method is used to return the total bill.
	 * @return It returns final bill amount.
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