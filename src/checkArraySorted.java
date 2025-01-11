
public class checkArraySorted {
	public static void main(String []args){
	       int [] arr={1,2,3,4,5};
	       
	   Boolean res=   sorted(arr);
	   System.out.print(res);
	     }
	     public static Boolean sorted(int[] arr){
	         Boolean result=null;
	     for(int i=0;i<arr.length-1;i++){
	          if(arr[i]<=arr[i+1]){
	              result=true;
	           }
	           else{
	               
	               result=false;
	               break;
	           }
	     }
	           return result;
	}

}
