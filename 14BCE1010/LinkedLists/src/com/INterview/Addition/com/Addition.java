package com.INterview.Addition.com;

import java.util.Scanner;



public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		Scanner s = new Scanner(System.in);
		System.out.println("\n Enter the number of elements:\n");
		int n = s.nextInt();
		for(int i = 0 ; i < n; i++) {
			l1.push(s.nextInt());
			
		}
		for(int i = 0 ; i < n; i++) {
			l2.push(s.nextInt());
			
		}
		LinkedList l = new LinkedList();
		Node rs = l.addTwoLists(l1.head,l2.head,0);
		l.printList(rs);
		

	}

}
class Node {
	int data;
	Node next = null;
	
	public Node(int data) {
		this.data = data;
	}
	public Node(int carry, Node n1,Node n2) {
		
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
	 void printList(Node head) {
	        while (head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        System.out.println("");
	    }
	 Node addTwoLists(Node l1,Node l2,int carry) {
		 if(l1 == null && l2 == null && carry == 0) {
			 return null;
		 }
      Node result = new Node(carry,null,null);
      
      int value = carry;
      if(l1 != null) {
    	  value += l1.data;
      }
      if(l2 != null ) {
    	  value += l2.data;
      }
      result.data = value%10;
      Node more = null;
      if(l1 != null || l2 != null) {
    	  more = addTwoLists(l1 == null ? null:l1.next,l2 == null?null:l2.next,value>=10?1:0);
      }
      return more;
		 
	 }
	
}