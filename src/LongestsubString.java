
public class LongestsubString {
	public static void main(String args[]) {
		 int [] arr={2,9,5,1,9};
		 int target=10;
	     int k= sum(arr,target);
	    System.out.print("Longest Sub array"+k);

}
	
	public static int sum(int [] arr,int target) {
		
		int len=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];   
				if(sum==target) {
					len = Math.max(len, j - i + 1);
				}
			}
			
		}
		return len;
	}

}
