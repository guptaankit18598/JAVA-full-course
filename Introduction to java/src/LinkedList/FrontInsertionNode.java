package LinkedList;

import java.util.LinkedList;

public class FrontInsertionNode {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		
	}
    public class Node{
    	int data;
    	Node next;
    	public Node(int d) {
    		data = d;
    		next = null;
    		
    	}
    }
    private Node head;
    public void addFirst(int data) {
    	Node nn = new Node(data);
    	nn.next = head;
    	head = nn;
    }
    public void printList() {
    	Node temp = head;
    	while(temp != null) {
    		System.out.println(temp.data);
    		temp = temp.next;
    	}
    }
    public void addEnd(int data) {
    	Node nn = new Node(data); // New node
    	if(head == null) {   // if linked list is empty
    		head = nn;   //head points to the new node
    		return;
    	}
    	Node temp = head;
    	if(temp.next != null) {
    		temp = temp.next;
    	}
    	temp.next = nn;
    }
    public void addMiddle(int idx , int data) {
    	
    	if(idx<0)
          return;
    	if(idx == 0) {
    		addFirst(data);
    	     return;
    	}
    	     Node nn = new Node(data);
    	    Node temp = head;
    	    for(int i = 0; i<idx-1;i++) {
    	    	temp = temp.next;
    	    	 
    	     }
    	    temp.next = nn;
    	    nn.next = temp.next;
    	    	 
    }
    public void deleteFront() {
    	head = head.next;
    }
    public void deleteEnd() {
    	Node temp = head;
    	while(temp.next.next != null) {
    		temp = temp.next;
    	}
    	temp.next = null;
    }
    public void deleteMiddle(int idx) {
    	Node temp = head;
    	for(int i =0;i<idx-1;i++) {
    		temp = temp.next;
    	}
    	temp.next = temp.next.next;
    }
    // To delete the entire Linked list
    // head = null;
}
