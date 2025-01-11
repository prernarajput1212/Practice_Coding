import java.awt.datatransfer.StringSelection;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.lang.model.element.Element;

public class TernarySearching {
	public static void main(String args[]) {
		int arr[]= {2,5,7,12,15,23};
		int k=7;
		int initial=0;
		int last=arr.length-1;
		int ans=ternarySearch(arr,k,initial,last);
		
		if (ans==-1) {
			System.out.print("element not found");
		}
		else {
			System.out.print("element found at :"+ans);
		}
	}

	private static int ternarySearch(int[] arr, int k, int initial, int last) {
		while(initial<=last) {
		int	middle1=initial+(last-initial)/3;
		int middle2=last-(last-initial)/3;
		if(k==arr[middle1]) {
			return middle1;
		}
		if(k==arr[middle2]) {
			return middle2;
		}
		if(k<arr[middle1]) {
			return ternarySearch(arr, k, initial, middle1-1);
		}
		else if(k>arr[middle2]) {
		return	ternarySearch(arr, k, middle2+1, last);
		}
		else {
		return	ternarySearch(arr, k, middle1+1, middle2-1);
		}
		}
		return-1;
	}

}
