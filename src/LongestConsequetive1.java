import java.util.ArrayList;

public class LongestConsequetive1 {
	public static void main(String args[]) {
		
		  int arr1[] = {2,1,0,0,2,2,2,2};
		 
		  int n = longestConsequetive(arr1);
		
		  
		    System.out.print(n);
	
}
	public static int longestConsequetive(int [] arr1) {
		int i=1;
		int count=1;
	for(i=1;i<arr1.length;i++) {
		if(arr1[i-1]!=arr1[i]) {
			count=1;
		}
		else {
			count++;
		}
	}
	return count;
	}

}
