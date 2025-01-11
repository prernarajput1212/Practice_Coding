import java.util.ArrayList;

public class NumberAppearOnceUsingHasing {
	public static void main(String args[]) {
		 int [] arr={4,1,2,1,2,4,7};
	     int k= appearOnce(arr);
	    System.out.print(k);

}
	public static int appearOnce(int [] arr) {
		int n=arr.length;
		int max=arr[0];
		for(int i=0;i<n;i++) {
			max=Math.max(max, arr[i]);
		}
			int [] hash=new int[max+1];
			for(int i=0;i<n;i++) {
				hash[arr[i]]++;
			}
			
			 for (int i = 0; i < n; i++) {
		            if (hash[arr[i]] == 1)
		                return arr[i];
		        }

		      
		        return -1;
		    }
		

		
	}
	