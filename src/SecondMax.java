
public class SecondMax {
	
	public static void main(String[] args) {
		int [] arr= {12,11,24,34,33,34,35,35,36};
		int result=secondMax(arr);
		System.out.print("second maximum value  "+  result);
		
	}
 public static int  secondMax(int[] arr) {
	 
	 int firstmax=-1;
	 int secondmax=-1;
	 for(int i=0;i<arr.length;i++) {
		 
		 if(arr[i]>firstmax) {
			 secondmax=firstmax;
			 firstmax=arr[i];
			 
		 }
		 else if (arr[i]>secondmax && arr[i]!=firstmax) {
			 secondmax=firstmax;
			
			
		} 
		 }
	 return secondmax;
	 }

	

}
