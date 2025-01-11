
public class InsertionSort {
	public static void main(String args[]) {
		int arr[]= {23,4,34,7,5,21,78};
		int n=arr.length;
		int temp;
		for(int i=0;i<n-1;i++) {
			int j=i+1;
			while(j>0) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					}
				j--;
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}
