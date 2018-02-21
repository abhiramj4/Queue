package main;

public class Node<T> extends Object {

	private T data; //node data
	private Node previous; //previous node
	private Node next; //next node
	/**
	 * constructor for type node
	 * @param data the value held by the node
	 */
	public Node(T data) {
		this.data = data;
		
	}
	
	/**
	 * get the node data
	 * @return the data of this node
	 */
	public T getData() {
		return data;
	}
	
	/**
	 * get the previous node
	 * @return the previous node
	 */
	public Node getPrevious() {
		return previous;
	}
	
	/**
	 * get the next node
	 * @return the next node
	 */
	public Node getNext() {
		return next;
	}
	
	/**
	 * Set the next node to this node
	 * @param node object to be next
	 */
	public void setNext(Node node) {
		this.next = node;
	}
	
	/**
	 * Set the previous node to this node
	 * @param node object to be set previous
	 */
	public void setPrevious(Node node) {
		this.previous = node;
	}
	
}
