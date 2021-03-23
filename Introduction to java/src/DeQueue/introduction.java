package DeQueue;

import Queue.myQueue;

public class introduction {

	public static void main(String[] args) {
		myQueue<Integer> q = new myQueue<>();
		q.enqueue(55);
		q.enqueue(77);
		q.enqueue(88);
		int u = q.dequeue();
		System.out.println(u);
		


	}

}
