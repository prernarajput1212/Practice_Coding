import java.awt.HeadlessException;

public class SinglyLinkedList {
	private LinkedList head;
	
	private static class LinkedList{
		private int data;
		private LinkedList next;
		public LinkedList(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void display() {
		LinkedList current=head;
		while(current!=null) {
			System.out.print(current.data+ "-->");
			current=current.next;
		}
		System.out.print("null");
	}
 public static void main(String[] args) {
	 SinglyLinkedList ss=new SinglyLinkedList();
	 ss.head=new LinkedList(10);
	 LinkedList first=new LinkedList(12);
	 LinkedList second=new LinkedList(18);
	 LinkedList third=new LinkedList(20);
	 ss.head.next=first;
	 first.next=second;
	 second.next=third;
	 ss.display();
 }
	
}
