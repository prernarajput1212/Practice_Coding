
public class leftRotate {
	public static void main(String []args){
        int [] arr={1,2,3,4,5};
        int[] k= leftrotate(arr);
        for(int i=0;i<k.length;i++){
            System.out.print(arr[i]+" ");
        }
        
     }
     public static int[] leftrotate(int[] arr){
        int temp=arr[0];
         for(int j=1;j<arr.length;j++){
            arr[j-1]=arr[j];
         }
             arr[arr.length-1]=temp;
             
             return arr;
         }
       

}
