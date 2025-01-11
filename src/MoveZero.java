import java.awt.datatransfer.StringSelection;

public class MoveZero {
	public static void main(String[] args) {
		int [] arr= {0,4,0,1,2};
		int n=arr.length;
		printArray(arr);
		int [] result=movezeroes(arr,n);
		printArray(result);
		
	}
 public static int[] movezeroes(int[] arr,int n) {
	
	 int j=0;
	 for(int i=0;i<n;i++) {
		 if(arr[i]!=0 && arr[j]==0) {
			 int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
		 }
		 if(arr[j]!=0) {
			 j++;
		 }
	 }
	 return arr;
 }
 public static void printArray(int[] arr) {
	 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+ "");
	 }
	 System.out.print("\n");
 }
}
