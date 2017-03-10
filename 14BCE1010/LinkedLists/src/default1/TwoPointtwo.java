package default1;
import java.util.*;

public class TwoPointtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		LinkedList list = new LinkedList();
		System.out.println("\n Enter the number of elements:\n");
		int n = s.nextInt();
		for(int i = 0 ; i < n; i++) {
			list.push(s.nextInt());
			
		}
		
		Node x = list.nthToLast(3);
		System.out.print(x.data );
		list.deleteNode(4);
		list.display();

	}

}
class Node {
	int data;
	Node next = null;
	
	public Node(int data) {
		this.data = data;
	}
}
class LinkedList {
	Node head;
	
	public void push(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
	}
	public void display() {
		Node n = head;
		while(n.next != null) {
			System.out.print(n.data + "->");
			n = n.next;

		}
		System.out.print(n.data);
	}
	public Node nthToLast(int k) {
		Node p1 = head;
		Node p2 = head;
		
		for(int i = 0; i < k-1; i++) {
			
			p2 = p2.next;
		}
		
		while(p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
	public void deleteNode(int data) {
		Node n = head;
		while(n.next.data != data) {
			n = n.next;
		}
		Node newnode = n.next.next;
		n.next = newnode;
		
	}
	
}