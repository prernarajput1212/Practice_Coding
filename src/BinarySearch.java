import javax.lang.model.element.Element;

public class BinarySearch {
	public static void main(String args[]) {
		 int arr[]= {2,4,7,9,12,15,23};
		 int k=12;
		 int initial=0;
		 int last=arr.length-1;
		 int ans= findPositionofElement(arr,k,initial,last);
	}

	private static int findPositionofElement(int[] arr, int k,int initial,int last) {
		while(initial<=last) {
		
		
		int middle= initial+(last-initial)/2;
		
		if(k==arr[middle]) {
			
			System.out.print("Element fount at: "+ arr[middle]);
			return middle;
		}
		if(k>arr[middle]) {
			initial=middle+1;
		}
		else {
			initial=0;
			last=middle-1;
		}
		
		
	}
		System.out.print("Element not found ");
		return -1;
	}

}
