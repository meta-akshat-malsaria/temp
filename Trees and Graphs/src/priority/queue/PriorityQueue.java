package priority.queue;

public class PriorityQueue {
	private static int MAX;
	private int[] arr;
	private static int nItems;
	
	public PriorityQueue(){
		MAX=1000;
		arr= new int[MAX];
		nItems=0;
	}
	
	public void insert(int val){
		int i;
		if(nItems==0){
			arr[0]=val;
			nItems++;
			return;
		}
		for(i=nItems-1;i>=0;i--){
			if(val>arr[i]){
				arr[i+1]=arr[i];
			}
			else{
				break;
			}
		}
		arr[i+1]=val;
		nItems++;
	}
	
	public void printPriorityQueue()throws Exception{
		if(nItems>=MAX) {
			throw new Exception("Array Index out of Bound.");
		}
		for(int i=0;i<nItems;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public int remove(){
		return arr[--nItems];
	}
	
	public boolean isFull(){
		return nItems==MAX;
	}

	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public int getPeek(){
		return arr[nItems-1];
	}

	public static void main(String[] args){
		PriorityQueue pq =new PriorityQueue();
		pq.insert(9);
		pq.insert(2);
		pq.insert(11);
		pq.insert(1);
		pq.insert(4);
			
		try {
			pq.printPriorityQueue();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}
}
