package main;

public class ArrayQueue {

	private final int SIZE;
	private int[] queue;
	private int front;
	private int back;

	/**
	 * init an array based implementation of the queue
	 * @param size of the array
	 */
	public ArrayQueue(int size) {
		
		queue = new int[size];
		this.SIZE = size;
		front = 0;
		back = SIZE - 1;
		
	}
	
	/**
	 * check if the queue is full
	 * @return true if queue is full
	 */
	public boolean isFull() {
		if((back + 1) % SIZE == front) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * check if the queue is empty
	 * @return true if the queue is empty
	 */
	public boolean isEmpty() {
		
		if(front == back) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * add a value to the rear of the queue
	 * @param value to be added
	 */
	public void enqueue(int value) {
		
		if(isFull()) {
			System.out.println("Queue is full");
		} else {
			back = (back+1) % SIZE;
			queue[back] = value;
		}
	}
	
	/**
	 * remove a value from the front of the queue
	 */
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		} else if(front == back) {
			front = back - 1;
		}
		front = (front + 1) % SIZE;
	}
	
	
}
