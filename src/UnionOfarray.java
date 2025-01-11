import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class UnionOfarray {
	public static void main(String args[]) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {3,4,5,6};
		int [] result= UnionOfarray(arr1,arr2);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
			
		}
	}
public static int[] UnionOfarray(int[] arr1, int [] arr2) {
	int n=arr1.length;
	int m=arr2.length;
int 	index=0;
	int [] result=new int[6];
	HashSet<Integer> si=new HashSet<>();
	for(int i:arr1) {
		si.add(i);
		
	}
	for(int i:arr2) {
		si.add(i);
	}
	 for(int i:si) {
		result[index]=i;
		index++;
	 }
		
return result;
}
}
