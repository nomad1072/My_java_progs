

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class TwoPointOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		LinkedList list = new LinkedList();
		System.out.println("\n Enter the number of elements:\n");
		int n = s.nextInt();
		for(int i = 0 ; i < n; i++) {
			list.push(s.nextInt());
			list.deleteDups();
			
		}
		list.deleteDups();
		list.display();

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
	public void deleteDups() {
		Map t = new HashMap();
		Node prev = null;
		Node n = head;
		
		while(n != null) {
			if(t.containsKey(n.data)) {
				prev.next = n.next;
				
				
			}
			else {
				t.put(n.data, true);
				prev = n;
			}
			n = n.next;
			
		}
	}
}

class Node {
	int data;
	Node next;
	
	public Node(int d) {
		data = d;
		next = null;
	}
}
