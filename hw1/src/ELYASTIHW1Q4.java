public class ELYASTIHW1Q4 {
    public static <T> void printStackInOrder(Stack<T> s) {
        Stack<T> s2 = new Stack<>();
        int count = 0;

        // Transfer elements to s2 while maintaining the order
        while (!s.isEmpty()) {
            s2.push(s.topEl());
            s.pop();
            count++;
        }

        // Transfer elements back to s while maintaining the order
        while (count > 0) {
            T v1 = s2.topEl();
            s2.pop();
            for (int x = count - 1; x > 0; x--) {
                s2.push(s2.topEl());
                s2.pop();
            }
            s2.push(v1);
            count--;
        }

        // Transfer elements from s2 back to s
        while (!s2.isEmpty()) {
            s.push(s2.topEl());
            s2.pop();
        }
    }

    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Print the original stack
        System.out.println("Original Stack: " + stack);

        // Print the stack in the same order using the printStackInOrder method
        printStackInOrder(stack);

        // Print the stack after maintaining the same order
        System.out.println("Stack in the Same Order: " + stack);
    }
}
