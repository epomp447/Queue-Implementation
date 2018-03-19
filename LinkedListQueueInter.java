/*Interface For LinkedListQueue */
	public interface LinkedListQueueInter<E> {
		public  int size();
		public void offer(E item);
		public E poll();
		public E peek();
		public boolean isEmpty();
	}

