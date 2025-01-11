import java.util.HashMap;

public class Longestsubstringusinghashmap {
	public static void main(String args[]) {
	 int [] arr={2,9,5,1,9};
	 int target=10;
     int k= sum(arr,target);
    System.out.print("Longest Sub array"+k);

}
	public static int sum(int [] arr,int target) {
		int sum=0;
		int len=0;
		HashMap <Integer,Integer> premap=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum==target) {
				len=Math.max(len, i+1);
			}
			 if (premap.containsKey(sum-target)) {
				int newlen=i-premap.get(sum-target);
				len=Math.max(len, newlen);
			}
			else if	(!premap.containsKey(sum)) {
			
				premap.put(sum, i);
			}
		}
		return len;
	}
	
	
}