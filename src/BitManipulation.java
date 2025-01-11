import java.util.Scanner;

public class BitManipulation {
public static void main(String args[]) {
	System.out.println("Enter the number");
	Scanner scanner= new Scanner(System.in);
	int n=scanner.nextInt();
	System.out.println("Enter the nth bit");
	int x=scanner.nextInt();
//	System.out.println("Check number is Even: "+ checkEvenNumber(n));
//	System.out.println("check nt bit is set: "+ checknthBitIsSet(n,x));
//	System.out.println("set my nth bit: "+ setMynthBit(n,x));
//	System.out.println("unset my nth bit: "+ unsetMynthBit(n,x));
//	System.out.println("toggle my nth bit: "+ toggleMynthBit(n,x));
//	System.out.println("turnoff my rightmosth bit: "+ turnoffMyrightmostBit(n));
	System.out.println("turnon my rightmost bit: "+ turnonMyrightmostBit(n));
}

private static int turnonMyrightmostBit(int n) {
	// TODO Auto-generated method stub
//	return n|1;
	return n|(n+1);
}

private static int turnoffMyrightmostBit(int n) {
	
	//return (n>>1)<<1;
	return n&(n-1);
}

private static int toggleMynthBit(int n, int x) {
	
	return n^(1<<x);
}

private static int unsetMynthBit(int n, int x) {
	// TODO Auto-generated method stub
	return n&(~(1<<x));
}

private static int setMynthBit(int n, int x) {
	return n|(1<<x);
	
}

private static boolean checknthBitIsSet(int n, int x) {
	if((n&(1<<x))>0) {
		return true;
	}
	else return false;
}

private static Boolean  checkEvenNumber(int n) {
	if((n&1)==0) {
		return true;
	}
	else return false;
}
}
