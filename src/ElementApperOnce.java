import java.util.ArrayList;



public class ElementApperOnce {
	public static void main(String args[]) {
	 int [] arr={4,1,2,1,2,4,7};
     int k= appearOnce(arr);
    System.out.print(k);

}
	public static int appearOnce(int [] arr) {
		ArrayList<Integer> result=new ArrayList<>();
	
		int k=0;
		for(int i=0;i<arr.length;i++) {
			int num=0;
			int number=arr[i];
			for(int j=0;j<arr.length;j++) {
				if(number==arr[j]) {
					num++;
				}
					
			}
			if(num==1) {
				return number;
			}
		}
		return -1;
	}
	
	
}