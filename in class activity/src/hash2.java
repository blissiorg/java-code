import java.util.HashMap;
class Pair {
    private int first;
    private int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
public class hash2 {

    public static Pair findTwoNumbers(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new Pair(map.get(complement), i);
            }

            map.put(nums[i], i);
        }

        return null; // Return null if no solution is found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Pair result = findTwoNumbers(nums, target);
        if (result != null) {
            System.out.println("Indices: [" + result.getFirst() + ", " + result.getSecond() + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}