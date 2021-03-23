package Queue;

import DeQueue.myDeque.Node;

public class myQueue<E> {
	
	private Node<E> head , rear;
	public void enqueue(int e) {
		Node<E> q  = new Node(e);
		if(head == null) {
			head = rear = q;
		}
		rear.next = q;
		rear  = rear.next;
		
	}
	public E dequeue() {
		if(head == null) {
			return null;
		}
		Node<E> temp = head;
		head = head.next;
		if(head == null) {
			rear = null;
		}
		return temp.data;
		
	}
	 public static class Node<E> {
    	 E data;
    	 Node<E> next ;
    	 private Node(E data) {
    		 this.data = data;
    		 this.next = null;
    	 }
    	 
     }
		 
	 }

