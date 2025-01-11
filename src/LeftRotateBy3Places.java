
public class LeftRotateBy3Places {
	public static void main(String []args){
	      int [] arr={1,2,3,4,5,6,7};
	      int k=3;
	      int n =arr.length;
	   int []  result=shiftbydplaces(arr,n,k);
	   printArray(result);
	     }
	   public static  int [] shiftbydplaces(int[] arr,int n,int k){
	    int index=0;
	         int []  temp=new int[k];
	         System.out.print("tempArray:");
	         for(int i=0;i<k;i++) {
	        	 temp[i]=arr[i];
	        	 System.out.print(temp[i]+" ");
	         }
	         System.out.print("\n");
	         System.out.print("Array after shigting:");
	        for(int j=0;j<k+1;j++){
	            arr[j]=arr[n-k+j-1];
	            System.out.print(arr[j] +" ");
	             
	         }
	        for(int j=k+1;j<n;j++) {
	        	arr[j]=temp[index];
	        	index++;
	        }
	         
	             return arr;
	        
	         }
	         public static void printArray(int[] arr){
	        	 System.out.print("Modified array: ");
	             for(int i=0;i<arr.length;i++){
	                 System.out.print(arr[i] + " ");
	             }
	            
	         }
}
