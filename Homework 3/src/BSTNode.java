class BSTNode<T extends Comparable<? super T>> {
    public T el;
    public BSTNode<T> left, right;
    BSTNode() {
    }
    BSTNode(T t) {
        el = t;
    }
    BSTNode(T t, BSTNode<T> lt, BSTNode<T> rt) {
        el = t;
        left = lt;
        right = rt;
    }
}