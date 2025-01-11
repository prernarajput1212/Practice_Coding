import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public static void main(String args []) {
		String[] strs= {"ate","tan","tea","nat","cat","eat"};
		
	
		Map<String, List<String>> map=new HashMap<>();
		for(String st:strs) {
			char[] charvalues= st.toCharArray();
			Arrays.sort(charvalues);
			String sortedvalues= new String(charvalues);
			if(map.containsKey(sortedvalues)) {
				map.get(sortedvalues).add(st);
				
			}
			else {
				List<String>word=new ArrayList<>();
				word.add(st);
				map.put(sortedvalues, word);
			}
			
			
		}
	
		for(String s :map.keySet()) {
			List<String> values = map.get(s);
			System.out.print(values);
		}
	}

}
