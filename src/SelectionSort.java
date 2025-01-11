
public class SelectionSort {
	public static void main(String args[]) {
		int arr[]= {78,2,34,56,12,31,2,0};
		int n=arr.length;
		for(int i=0;i<=n-2;i++) {
			int min=i;
			int temp;
			for(int j=i;j<=n-1;j++) {
				
				if(arr[min]>arr[j]) 
				{
					temp=arr[min];
					arr[min]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
