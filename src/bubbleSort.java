
public class bubbleSort {
public static void main(String args[]) {
	int arr[]= {6,9,23,45,12,3,1,6,7};
	int temp;
	// for(int i< n-1;i>=1;i--)
//	for(int j=0;j<i-1;j++)
	//
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]> arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");	
	}
}
}
               