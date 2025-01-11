
public class RemoveoddInteger {
	
	
	public static void main(String[] args) {
		int[] arr= {2,5,7,8,9,11};
		printArray(arr);
		removeoddnumbers(arr);
		
	}
	//input[2,5,7,8,9,11]
	//output[2,8]
	//create method to calculate the numberof even number 
	public static int [] removeoddnumbers(int[]arr) {
		int evenflag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenflag++;
			}
				
			}
		int[] result=new int[evenflag];
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				result[idx]=arr[i];
				idx++;
			}
		
		}
		printArray(result);
	return result;
	}
	
	public static void printArray(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.print("\n");
	}
	
	
	

}
