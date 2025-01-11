import java.util.ArrayList;
import java.util.List;

public class Recipeints {
	public static void main(String args[]) {
		String [] abc= {"ram","seeta","httte"};
		String [] xyz= {"ram1","seeta1","httte1"};
		String [] pqu= {"ram2","seeta2","httte2","sdsfd"};
		
		List<String>tu=new ArrayList<>();
		for(int i=0;i<abc.length;i++) {
			tu.add(i, abc[i]);
		}
		for(int i=0;i<xyz.length;i++) {
			tu.add(i, xyz[i]);
		}
		for(int i=0;i<pqu.length;i++) {
			tu.add(i, pqu[i]);
		}
		 System.out.print(tu);
	}

}
