import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String args[]) {
		System.out.println("Enter the number of disks you want to move");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		char initialRod='A';
		char finalRod='B';
		char helperRod='C';
		
	    towerOfHanoi(n, initialRod, finalRod,helperRod);
		
	}

	private static void towerOfHanoi(int n, char initialRod, char finalRod, char helperRod) {
		if(n==0) {
			return;
		}
		towerOfHanoi(n-1, initialRod, helperRod, finalRod);
		System.out.println("Move" +n+ "from InitialRod: "+initialRod+ "to final Rod:"+ helperRod);
		towerOfHanoi(n-1, helperRod, finalRod, initialRod);
		
	}

}
