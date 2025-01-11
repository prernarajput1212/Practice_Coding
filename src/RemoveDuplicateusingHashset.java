import java.util.HashSet;

public class RemoveDuplicateusingHashset {
	public static void main(String[] args) {
		int [] arr= {1,1,2,2,2,2,3,3,4,4};
		int result=removeduplicate(arr);
		for(int i=0;i<result;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int removeduplicate(int[] arr) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		int k=set.size();
		int index=0;
		for(int j:set) {
			arr[index]=j;
			index++;
		}
		return k;
	}
}
