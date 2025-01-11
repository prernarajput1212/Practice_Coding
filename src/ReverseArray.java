
import java.awt.datatransfer.StringSelection;


public class ReverseArray {
	
	public static void main(String[] args) {
		int [] arr= {12,3,5,6,9,11};
		printArray(arr);
		 reverseArray(arr,0,arr.length-1);
	printArray(arr);
	}

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.print("\n");
	}
	public  static void reverseArray(int[] arr,int i,int n) {
		int temp;

		while(i<n) {
			temp=arr[i];
			arr[i]=arr[n];
			arr[n]=temp;
			i++;
			n--;
				}
		
	}
	
}