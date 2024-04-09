
public class SLLNode<T> {
	T info;
	SLLNode<T> next;
	
	public SLLNode(T info, SLLNode<T> next) {
		this.info = info;
		this.next = next;
	}
	
	public SLLNode(T info) {
		this.info = info;
		next = null;
	}
	
	public SLLNode() {
		info = null;
		next = null;
	}
}
