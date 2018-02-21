package main;

public class LinearQueue<T> {

	Node first; //first item in the list
	Node last; //last item in the list
	
	/**
	 * init linear queue
	 */
	public LinearQueue() {
		this.first = null;
		this.last = null;
	}
	
	/**
	 * check if queue is empty
	 * @return true if the queue is empty
	 */
	public boolean isEmpty() {
		
		if(this.first == null || this.last == null ) return true;
		else {
			return false;
		}
	}
	
	/**
	 * add value to end of the queue
	 * @param data value to create new node
	 */
	public void enque(T data) {
		
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			
			newNode.setPrevious(last);
			last = newNode;
		}
	}
	
	/**
	 * remove first node in the queue
	 * @return previous first value of queue
	 */
	public Node deque() {
		
		if(isEmpty()) {
			System.out.println("Queue is empty!");
			return null;
		} else {
			first = first.getNext();
			Node dequed = first.getPrevious();
			first.getPrevious().setPrevious(null);
			return dequed;
			
		}
	}
}
