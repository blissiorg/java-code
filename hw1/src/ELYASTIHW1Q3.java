public class ELYASTIHW1Q3 {
    public static void transferStacks(Stack<Integer> S1, Stack<Integer> S2) {
        Stack<Integer> tempStack = new Stack<>();

        // Transfer elements from S1 to tempStack
        while (!S1.isEmpty()) {
            tempStack.push(S1.pop());
        }

        // Transfer elements from tempStack to S2 (in the same order as S1)
        while (!tempStack.isEmpty()) {
            int element = tempStack.pop();
            S1.push(element);
            S2.push(element);
        }
    }
    public static void main(String[] args) {
        // Create two stacks of integers
        Stack<Integer> S1 = new Stack<>();
        Stack<Integer> S2 = new Stack<>();

        // Push elements to S1
        S1.push(1);
        S1.push(2);
        S1.push(3);
        S1.push(4);
        S1.push(5);

        // Transfer elements from S1 to S2 while maintaining the order
        transferStacks(S1, S2);

        // Print the original stack
        System.out.println("Original Stack: " + S1);

        // Print the stack in the same order using the transferred elements
        System.out.println("Stack in the Same Order: " + S2);
    }


}
