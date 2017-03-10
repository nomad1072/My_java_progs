
public class MergeSortedLists extends Node {
	
	   
	
	private Node head1;
	private Node head2;

	MergeSortedLists(int d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	public Node merge(Node head1, Node head2) {
		Node res = new Node(0);
		Node h1 = head1, h2 = head2, p = res;
		while(h1 != null || h2 != null) {
			if(h1 != null && h2 != null) {
				if(h1.data <= h2.data) {
					p.next = h1;
					h1 = h1.next;
				}
				else {
					p.next = h2;
					h2 = h2.next;
				}
				p = p.next;
			}
			else if(h1 == null) {
				p.next = h2;
				break;
			}
			else if(h2 == null) {
				p.next = h1;
				break;
			}
		}
		return res.next;
	}
	public void addNode(Node head1, int data) {
		Node n = new Node(data);
		if(head1 == null) {
			//Node n = new Node(data);
			head1 = n;
			head1.next = null;
		}
		else {
		while(head1.next != null) {
			head1 = head1.next;
		}
		n = head1.next;
		head1 = n;
		}
		
		
	}
	static void printList(Node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedLists list = new MergeSortedLists(0);
	    Node head1 = null; Node head2 = null;
	/*	list.head1 = new Node(3);
		list.head1.next = new Node(4);
		list.head1.next.next = new Node(5);
		list.head1.next.next.next = new Node(6);
		list.head2 = new Node(1);
		list.head2.next = new Node(2);
		list.head2.next.next = new Node(3);
		list.head2.next.next.next = new Node(4);*/
		 Node rs;
	/*	rs = list.merge(head1, head2);
		printList(rs);*/
		list.addNode(head1,3);
		list.addNode(head1,4);
		list.addNode(head1,5);
		list.addNode(head1,6);
		list.addNode(head1,7);
		printList(head1);
		

	}

}
class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}
