import java.util.HashMap;

public class ShoppingCart {
	HashMap<String,Integer> hashPrice= new HashMap<String,Integer>();
	HashMap<String,Integer> hashQuantity= new HashMap<String,Integer>();
	
	
	void addToCart(String nameOfItem ,int priceOfItem, int quantityOfItem){
		hashPrice.put(nameOfItem,priceOfItem);
		hashQuantity.put(nameOfItem,quantityOfItem);
	}
	
	void updateCart(String nameOfItem,int updatedQuantity){
		hashQuantity.replace(nameOfItem,updatedQuantity);
	}
	
	void removeItem(String nameOfItem){ 
		hashPrice.remove(nameOfItem);
		hashQuantity.remove(nameOfItem);
	}
	
	int billGenerate(){
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
