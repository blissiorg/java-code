public class ELYASTIHW1Q2 {
    public static <T> void reverseStack(Stack<T> s) {
        Stack<T> s2 = new Stack<>();
        int count = 0;

        // Reverse the order odf elements using one additional stack an some non-array variables
        do {
            s2.push(s.topEl());
            s.pop();
            count++;
        } while (!s.isEmpty());

        // Rebuild the original stack with reversed elements
        do {
            T v1 = s2.topEl();
            s2.pop();
            for (int x = count - 1; x > 0; x--) {
                s.push(s2.topEl());
                s2.pop();
            }
            s2.push(v1);
            count--;

            // Transfer elements back to the original stack
            do {
                s2.push(s.topEl());
                s.pop();
            } while (!s.isEmpty());
        } while (count > 0);

        // Remove the last element
        s2.pop();

        // Transfer elements back to the original stack to complete the reversal
        do {
            s.push(s2.topEl());
            s2.pop();
        } while (!s2.isEmpty());
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

        // Reverse the stack using the reverseStack method
        reverseStack(stack);

        // Print the reversed stack
        System.out.println("Reversed Stack: " + stack);
    }
}
