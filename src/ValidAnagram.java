import java.util.HashMap;

public class ValidAnagram {
public static void main(String args[]) {
	String input="prernaaaa";
	String output="preraaana";
	
	HashMap<Character, Integer> hashinput= new HashMap<>();
	HashMap<Character, Integer> hashoutput= new HashMap<>();
	char arr1[] =input.toCharArray(); 
    char arr2[] = output.toCharArray();
	if(arr1.length!=arr2.length) {
		System.out.print("length of anagram is not equals");
	}
	else {
	for(int i=0;i<arr1.length;i++) {
		if(hashinput.get(arr1[i])==null) {
			hashinput.put(arr1[i],1);
			
		}
		else {
			int count=hashinput.get(arr1[i])+1;
		hashinput.put(arr1[i],count);
		System.out.println("input String value and count"+arr1[i]+count);
		}
	}
	for(int i=0;i<arr2.length;i++) {
		if(hashoutput.get(arr2[i])==null) {
             hashoutput.put(arr2[i],1);
			
		}
		else {
			int count=hashoutput.get(arr1[i])+1;
		hashoutput.put(arr2[i],count);
		System.out.println("output String value and count"+arr2[i]+count);
		}
	
}
	if(hashinput.equals(hashoutput)){
		System.out.print("true");
	}
	else {
		System.out.print("false");
		
	}
	}
}
}
