
public class MissingNumber {
	public static void main(String[] args) {
		int arr[]= {2,1,5,7,3,6};
		int n=arr.length+1;
		int result=missing(arr,n);
		System.out.print("Missing number from the array: "+ result);
	}
public static int missing(int[] arr,int n) {
	int sum=0;
	sum=(n*(n+1))/2;
	System.out.print("sum is: "+sum);
	for(int i=0;i<n-1;i++) {
		sum=sum-arr[i];
	}
	return sum;
}
}
