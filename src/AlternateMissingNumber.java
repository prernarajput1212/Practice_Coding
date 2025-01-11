
public class AlternateMissingNumber {
	public static void main(String []args){
	       int [] arr={2,4,6,1,7,3};
	       int n=arr.length;
	       missing(arr);
	     }
	     public static void missing(int[] arr){
	         int flag=1;
	     for(int i=0;i<arr.length;i++){
	         for(int j=0;j<arr.length;j++){
	             if(flag==arr[j]){
	                 flag++;
	                 break;
	             }
	             
	            
	         }
	         
	         
	     }
	           System.out.print("missing "+flag); 
	    
	     }
}
