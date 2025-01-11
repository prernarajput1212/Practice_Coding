import java.util.HashMap;

public class LongestSubarrayWithEqual0and1 {
	public static void main(String args[]) {
		 int [] arr={1,0,0,1,1,0,1};
		 int target=10;
	     int k= sum(arr,target);
	    System.out.print("Longest Sub array"+k);
}

	private static int sum(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i]=-1;
			}
		}
		int sum=0;
		int ans=0;
		HashMap <Integer,Integer> premap=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==0) {
				ans=i+1;
			}	
		if(!premap.containsKey(sum)) {
			premap.put(sum, i);
		}
		if(premap.containsKey(sum)) {
			int len=(i-premap.get(sum));
			if(ans<len) {
			ans=len;}
		}
		
		}
		return ans;
		}
	
		
}