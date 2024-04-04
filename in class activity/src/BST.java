public class BST<T extends Comparable<? super T>> {

    private BSTNode<T> root = null;

    BST() {

    }



    public void insert (T t) {

        BSTNode<T> p = root;

        BSTNode<T> prev = null;

        while (p != null) {

            prev = p;

            if (t.compareTo(p.el) < 0)

                p = p.left;

            else p = p.right;

        }

        if (root == null)

            root = new BSTNode<T>(t);

        else if (t.compareTo(prev.el) < 0)

            prev.left  = new BSTNode<T>(t);

        else prev.right = new BSTNode<T>(t);

    }



    public T search(T el) {

        BSTNode<T> p = root;

        while (p != null)

            if (el.equals(p.el))

                return p.el;

            else if (el.compareTo(p.el) < 0)

                p = p.left;

            else p = p.right;

        return null;

    }



    public void visit(BSTNode<T> p) {

        System.out.print(p.el + " ");

    }



    public void preorder() {

        preorder(root);

    }



    protected void preorder(BSTNode<T> p) {

        if (p != null) {

            visit(p);

            preorder(p.left);

            preorder(p.right);

        }

    }



    public void inorder() {

        inorder(root);

    }



    protected void inorder(BSTNode<T> p) {

        if (p != null) {

            inorder(p.left);

            visit(p);

            inorder(p.right);

        }

    }



    public void postorder() {

        preorder(root);

    }



    protected void postorder(BSTNode<T> p) {

        if (p != null) {

            preorder(p.left);

            preorder(p.right);

            visit(p);

        }

    }



    public void printTree() {

        printTree(root,0);

    }



    protected void printTree(BSTNode<T> p, int depth) {

        if (p != null) {

            printTree(p.right,depth+1);

            for (int i = 1; i <= depth; i++)

                System.out.print("     ");

            System.out.println(p.el);

            printTree(p.left,depth+1);

        }

    }
    public void breadthFirst() {
        BSTNode<T> p = root;
        Queue<BSTNode<T>> queue
                = new Queue<BSTNode<T>>();
        if (p != null) {
            queue.enqueue(p);
            while (!queue.isEmpty()) {
                p = queue.dequeue();
                visit(p);
                if (p.left != null)
                    queue.enqueue(p.left);
                if (p.right != null)
                    queue.enqueue(p.right);
            }
        }
    }

}