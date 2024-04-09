
public class SLL<T> {
	SLLNode<T> head, tail;
	
	void insertAtHead(T t) {
		if (head == null) {
			head = new SLLNode<T>(t);
			tail = head;
		}
		else {
			SLLNode<T> newHead = new SLLNode<T>(t, head);
			head = newHead;
		}
	}
	
	void insertAtTail(T t) {
		if (tail == null) {
			tail = new SLLNode<T>(t);
			head = tail;
		}
		else {
			SLLNode<T> newTail = new SLLNode<T>(t);
			tail.next = newTail;
			tail = newTail;
		}
	}
	
	T deleteFromHead() {
		if (head == null) { // If this list is empty
			return null;
		}
		T headInfo = head.info;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return headInfo;
	}
	
	T deleteFromTail() {
		if (tail == null) { // If the list is empty
			return null;
		}
		T tailInfo = tail.info;
		
		if (head == tail) { // If the list only has one node
			head = null;
			tail = null;
			return tailInfo;
		}
		
		SLLNode<T> newTail = null;
		for (SLLNode<T> node = head; node.next != null; node = node.next) {
			newTail = node;
		}
		newTail.next = null;
		tail = newTail;
		return tailInfo;
	}
	
	void print() {
		for (SLLNode<T> node = head; node != null; node = node.next) {
			System.out.print(node.info + "-->");
		}
		System.out.println();
	}
	boolean contains(T t) {
		for (SLLNode<T> node = head; node != null; node = node.next) {
			if (node.info.equals(t)) {
				return true;
			}
		}
		return false;
	}
	public String toString() {
		if (head == null) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		SLLNode<T> currentNode = head;

		while (currentNode != null) {
			sb.append(currentNode.info);
			if (currentNode.next != null) {
				sb.append(" --> ");
			}
			currentNode = currentNode.next;
		}

		return sb.toString();
	}
}
