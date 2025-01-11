import org.omg.CORBA.PUBLIC_MEMBER;

public class RemoveEvenInteger {
	
	public static void main(String[] args) {
		
		
		int[]arr= {1,7,2,3,4,5};
		
	
		printArray(arr);
		int [] result=removeEven(arr);
		printArray(result);
		
	}
		
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\n");
	}
	
	public static	int[] removeEven(int[]arr) {
			int oddflag=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2!=0) {
					oddflag++;
			}}
			
	 int[] result=new int[oddflag];
         int ind=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2!=0) {
					result[ind]=arr[i];
					ind++;
				}
				}
			return result;
		}
		
		}
	
	

