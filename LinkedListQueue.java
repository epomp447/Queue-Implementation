public class LinkedListQueue<E> implements LinkedListQueueInter<E>{
	private class Node<T> {
		T value;
		Node<T> next;

		public Node(T newItem, Node<T> ref) {
			value = newItem;
			next = ref;
		}
	}

	private Node<E> front;
	private Node<E> rear;
	private int size = 0;

	public LinkedListQueue() {
		front = null;
		rear = null;
		size = 0;
	}

	public E peek() {
		if (front == null) {
			return null;
		} else {
			return front.value;
		}
	}

	public E poll() {
		if (front == null) {
			return null;
		} else {
			E datavalue = front.value;
			front = front.next;
			size--;
			return datavalue;
		}
	}

	public void offer(E item) {
		if (front == null) {
			front = new Node<E>(item, null);
			rear = front;
		} else {
			rear.next = new Node<E>(item, null);
			rear = rear.next;
		}
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	
}