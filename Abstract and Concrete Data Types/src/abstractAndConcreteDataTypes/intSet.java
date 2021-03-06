package abstractAndConcreteDataTypes;
public final class intSet {
	
	private final int array[] = new int[1000];//To store the Set elements. It removes the duplicates.
	private int arrayIndex=0;//It is the size of array set.When a new element is added it increases by 1.
	
	/**
	 * A constructor of intSet class that form a set out of all the inputs receive in arr array.
	 * @param a
	 * @param size
	 */
	public intSet(int [] arr,int size){
		int i=0;
		for(i=0;i<size;i++){
			boolean present=false;
			for(int j=0;j<arrayIndex;j++){
				if(array[j]==arr[i]){
					present=true;
					break;
				}
			}
			if(!present){
				array[arrayIndex]=arr[i];
				arrayIndex+=1;
				}
			
		}	
	}
	
	/**
	 * This method prints all the elements of set.
	 */
	public void printSet(){
		if(arrayIndex!=0){
		System.out.println("Set elements are following:");
		for(int i=0;i<arrayIndex;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		}
	}
	
	/**
	 * This method tells if an element is present or not in the set.
	 * @param x element whose presence is to be checked.
	 * @return true or false.
	 */
	public boolean isMember(int x){
		int i=0;
		for(i=0;i<arrayIndex;i++){
			if(array[i]==x)
				return true;
		}
		return false;
	}
	public int size(){
		return arrayIndex;
	}
	
	/**
	 * This method checks whether a set is a subset of the main set or not.
	 * @param newSet set to be checked for subset.
	 * @return true or false.
	 */
	public boolean isSubSet(intSet newSet){
		int i=0;
		for(i=0;i<newSet.arrayIndex;i++){
			if(!this.isMember(newSet.array[i])){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * This method returns the compliment set 
	 * @return intSet type.
	 */
	public intSet getComplement(){
		int arr[] = new int[1000];
		int complementIndex=0;
		int i;
		for(i=1;i<=1000;i++){
			if(!this.isMember(i)){
				arr[complementIndex]=i;
				complementIndex+=1;
			}
		}
		intSet complementSet = new intSet(arr,complementIndex);
		return complementSet;
	}
	
	/**
	 * Method to make union of two sets
	 * @param newSet new set to form union 
	 * @return union
	 */
	public intSet union(intSet newSet){
		int arr[] = new int[1000];
		int i=0,j=0,index=0;
		for(i=0;i<this.arrayIndex;i++){
			boolean present=false;
			if(i!=0){
				for(j=0;j<index;j++){
					if(arr[j]==this.array[i]){
						present=true;
					}
				}
			}
			if(!present){
				arr[index]=this.array[i];
				index+=1;
			}
			}
			for(i=0;i<newSet.arrayIndex;i++){
			boolean present=false;
			for(j=0;j<index;j++){
				if(arr[j]==newSet.array[i]){
					present=true;
				}
			}
			if(!present){
				arr[index]=newSet.array[i];
				index+=1;
			}
		}
		intSet union = new intSet(arr,index);
		return union;
	}
}