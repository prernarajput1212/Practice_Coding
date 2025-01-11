import java.awt.datatransfer.StringSelection;
import java.awt.print.Printable;

import javax.sound.midi.Soundbank;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ArraysUpdate {
	
	
	public void printArray(int[] arr) {
		int n= arr.length;
		int i;
		for(i=0;i<n;i++){
		
			System.out.print(arr[i] +" ");
		}
	}
public static void main(String[] args)
{
	ArraysUpdate ob=new ArraysUpdate();
	
	int[] myarray= {4,5,7,9};
	ob.printArray(myarray);
	myarray[2]=10;
	myarray[1]=14;
	ob.printArray(myarray);
	System.out.println("length of the array"+myarray.length);
	
	
	
}
}

