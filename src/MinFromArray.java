
public class MinFromArray {
	
	public static void main (String[] args) {
		int[] arr= {15,17,9,4,4,5};
		int result=findMin(arr);
		System.out.print("Min number of Array:" + result);
	}
public static int findMin(int[] arr) {
	int min=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		
	}
	return min;
}
}
