package learn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Node {
	public int data;
	public Node next;

	Node(int n) {
		data = n;
	}

	public void nextNode(Node n) {
		next = n;
	}

}

class Queue {
	public Node head;
	public Node tail;

	Queue() {
		head = null;
		tail = null;
	}

	Queue(int d) {
		Node newNode = new Node(d);
		newNode.nextNode(null);
		head = newNode;
		tail = newNode;
	}

	public void enqueue(int n) {
		Node newNode = new Node(n);
		if (tail != null) {
			tail.nextNode(newNode);
		}
		else
			head = newNode;
		tail = newNode;
		tail.nextNode(null);
		System.out.println("Node enqueued: " + tail.data);
	}

	public void dequeue() {
		if(head == tail){
			tail = null;
		}
		if (head == null) {
			System.out.println("Queue is empty.");
		}
		else{
			System.out.println("Node dequeued: " + head.data);
			head = head.next;
		}
	}
	
	public void traverse(){
		if(head == null)
		{
			System.out.println("Queue empty");
		}
		Node temp = head;
		int i = 1;
		while(temp!=null)
		{
			System.out.println("Node at position : "+(i++)+ " -> " + temp.data);
			temp=temp.next;
		}
	}
}

public class LinkedListQueue {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
		try{
		Queue q = new Queue();
		int choice=1;
		while(choice!=0)
		{
			System.out.println("Enter your choice: (0 to exit)");
			choice = Integer.parseInt(br.readLine());
			switch(choice){
				
				case 1:
					System.out.println("Enter the data you want to insert in the queue.");
					q.enqueue(Integer.parseInt(br.readLine()));
					break;
				case 2:
					q.dequeue();
					break;
				default:
					break;
					
			}
		}
		
		}
		catch(Exception e)
		{}
		//System.out.println(q.tail.data);
	}
}
