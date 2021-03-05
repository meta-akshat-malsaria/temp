package abstractAndConcreteDataTypes;
public final class intSet {
	private final int array[] = new int[1000];//To store the Set elements. It removes the duplicates.
	private int arrayIndex=0;//It is the size of array(Set). When a new element is added it increases by 1
	public intSet(int [] a,int size){
		int i=0;
		for(i=0;i<size;i++){
			boolean present=false;
			for(int j=0;j<arrayIndex;j++){
				if(array[j]==a[i]){
					present=true;
					break;
				}
			}
			if(!present){
				array[arrayIndex]=a[i];
				arrayIndex+=1;
				}
			
		}	
	}
	public void printSet(){
		if(arrayIndex!=0){
		System.out.println("Set elements are following:");
		for(int i=0;i<arrayIndex;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		}
	}
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
	public boolean isSubSet(intSet s){
		int i=0;
		for(i=0;i<s.arrayIndex;i++){
			//check whether all the elements of s are present in Original Set in or not
			if(!this.isMember(s.array[i])){
				return false;
			}
		}
		return true;
	}
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
	public intSet union(intSet s2){
		int arr[] = new int[1000];
		int i=0,j=0,index=0;
		for(i=0;i<this.arrayIndex;i++){
			boolean present=false;
			for(j=0;j<index;j++){
				if(arr[j]==this.array[i]){
					present=true;
				}
			}
			if(!present){
				arr[index]=this.array[i];
				index+=1;
			}
		}
		for(i=0;i<s2.arrayIndex;i++){
			boolean present=false;
			for(j=0;j<index;j++){
				if(arr[j]==s2.array[i]){
					present=true;
				}
			}
			if(!present){
				arr[index]=s2.array[i];
				index+=1;
			}
		}
		intSet union = new intSet(arr,index);
		return union;
	}
}