
public class DEQueue<T> implements QueueInterface<T> {
	int numOfItems;
	Node last, first;
	
	public DEQueue(){
		last = null;
		first = null;
	}
	
	private class Node{
		private T data;
		private Node prev,next;
		
		public Node(T d, Node p, Node n){
			data = d;
			prev = p;
			next = n;
		}
	}
	
	@Override
	public void enqueue(T newEntry) {
		Node temp = new Node (newEntry, last, null);
		if(last != null)
			last.next = temp;
		last = temp;
		if (first == null){
			first = temp;
		}
	}

	@Override
	public void enqueueFront(T newEntry) {
		Node temp = new Node (newEntry, null, first);
		if(first != null)
			first.prev = temp;
		first = temp;
		if (last == null){
			last = temp;
		}
	}

	@Override
	public T dequeueBack() {
		T temp = null;
		if (!isEmpty()){
			if (last == null){
				
				last = null;
			}
			else {
				temp = last.data;
				last = last.prev;
				//last.next.data = null;
				if (last != null)
					last.next = null;
			}
		}

		return temp;
	}

	@Override
	public T dequeue() {
		T temp = null;
		if (!isEmpty()){
			if (first == null){
				first = null;
			}
			else{
				temp = first.data;
				first = first.next;
				//first.prev.data = null;
				if (first != null)
					first.prev = null;
			}
		}
		return temp;
	}

	@Override
	public T getFront() {
		return first.data;
	}

	@Override
	public boolean isEmpty() {
		boolean result = false;
		if (last == null && first == null)
			result = true;
		return result;
	}

	@Override
	public void clear() {
		first = null;
		last = null;
	}

}
