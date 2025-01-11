
public class ResizeofArray {
	public static void main(String[] args) {
		int arr[]= {2,4,7,6};
		printArray(arr);
	int[] result=	resize(arr, 2*arr.length);
		printArray(result);
	}

	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}
	
	public static int [] resize(int[] arr, int capacity) {
		int[] result=new int[capacity];
		for(int i=0;i<arr.length;i++) {
			result[i]=arr[i];
		}
		return result;
	}
}

