package main;

public class CircQueue<T> {

	private Node lastNode; //keep track of the front of the queue
	//front of the queue is the next element of the lastNode
	
	/**
	 * Init the queue, sets front and back to null
	 */
	public CircQueue() {
		
		
		this.lastNode = null;
	}
	
	public boolean isEmpty() {
		
		if(this.lastNode == null) return true;
		else {
			return false;
		}
	}
	
	public void enque(T data) {
		
		Node newNode = new Node(data);
		if(isEmpty()) {
			
			newNode.setNext(newNode);
			lastNode = newNode;
			
		} else {
			newNode.setNext(lastNode.getNext());
			lastNode.setNext(newNode);
			lastNode = newNode;
			
		}
		
	}
	
}
