import java.util.HashMap;

public class hash2 {

    public static Pair findTwoNumbers(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];

            if (map.containsKey(sub)) {
                return new Pair(map.get(sub), i);
            }

            map.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        int[] nums ={3,2,4};
//        int target = 6;
        int[] nums ={3,3};
        int target = 6;
        Pair result = findTwoNumbers(nums, target);
        if (result != null) {
            System.out.println("[" + result.getFirst() + ", " + result.getSecond() + "]");
        } else {
            System.out.println("No solution found");
        }
    }
}