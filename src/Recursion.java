import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class Recursion {
	//print 1ton numbers
	public static void main(String args[]) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number");
	n=sc.nextInt();
	// print(n);
//	int fact=printFactorial(n);
//	System.out.print("factorial of number:"+ fact);
	String str="axaxbyty";
	String str1="aaabbbcyyyy";
	String anString=CleanString(str1);
	System.out.print("Cleaned:"+ anString);
	int countpair=samePair(str);
	System.out.print("pair:"+ countpair);
	
	}

	private static String CleanString(String str1) {
		if(str1.length()<=1) {
			return str1;
		}
		if(str1.charAt(0)==str1.charAt(1)) {
			return CleanString(str1.substring(1));
		}
		else {
			return str1.charAt(0)+CleanString(str1.substring(1));
		}
		
	}

	private static int samePair(String str) {
		if(str.length()<=2) {
			return 0;
		}
		if(str.charAt(0)==str.charAt(2)) {
			return 1+samePair(str.substring(1));
		}
		else {
			return samePair(str.substring(1));
		}
		 
	}

	private static int printFactorial(int n) {
		if(n==0) {
			return 1;
		}
		int ans=n*printFactorial(n-1);
		return ans;
	}

	private static void print(int n) {
		if(n==0) {
			return;
		}
	//	System.out.print(n+" ");
		print(n-1);
		System.out.print(n+" ");
		
	}
}
