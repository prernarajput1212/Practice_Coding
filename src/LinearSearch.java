
public class LinearSearch {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		int num=7;
		int x= linearSearch(arr,num);
		System.out.print(x);
	}
	public static int linearSearch(int[] arr, int num) {
		int result=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				result=i;
				flag=true;
				break;
			}
			
		}
		
			if(flag) {
				return result;
			}
			else {
				result=-1;
				return result;
			}
		
	}
}
