package com.INterview.Coding.TwoPointFour.com;

import java.util.Scanner;

public class TwoPointFour {

	public static void main(String[] args) throws NullPointerException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		LinkedList l = new LinkedList();
		System.out.println("\n Enter the number of elements:\n");
		int n = s.nextInt();
		for(int i = 0 ; i < n; i++) {
			l.push(s.nextInt());
			
		}
		l.partition(5);
		

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
	static Node head;
	
	public static void push(int data) {
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
	public void partition(int x) {
		Node beforeStart = null;
		Node afterStart = null;
		Node node = head;
		while(node != null) {
			if(node.data < x) {
				node.next = beforeStart;
				beforeStart = node;
			}
			else {
				node.next = afterStart;
				afterStart = node;
			}
			node = node.next;
			
		}
		
		Node n = beforeStart;
		while (beforeStart.next != null) {
			beforeStart = beforeStart.next;
			System.out.println(beforeStart.data);
		}
		while (afterStart.next != null) {
			afterStart = afterStart.next;
			System.out.println(afterStart.data);
		}
		beforeStart.next = afterStart;
		while(n != null) {
			System.out.print(n.data + "->");
		}
		
	
	}
}