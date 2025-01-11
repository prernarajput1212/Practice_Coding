import java.awt.datatransfer.StringSelection;

public class nRaiseToPowerP {
	public static void main(String args[])
	{
		int n=2;
		int p=3;
int ans=	power(n,p);
	System.out.print(ans);
	}

	private static int power(int n, int p) {
		if(p==0) {
			return 1;
		}
		return n*power(n, p-1);
	}

}
