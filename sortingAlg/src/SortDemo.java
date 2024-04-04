
public class SortDemo {
	public static void main(String[] args) {
		int[] originalNums = {8, 6, 7, 5, 3, 0, 9};
		
		System.out.print("Selection Sort: ");
		printArray(selectionSort(originalNums));
		
		System.out.print("Insertion Sort: ");
		printArray(insertionSort(originalNums));
		
		System.out.print("Bubble Sort   : ");
		printArray(bubbleSort(originalNums));
	}
	
	public static int[] selectionSort(int[] originalNums) {
		int[] nums = originalNums.clone();
		
		// TODO: Write selection sort logic here.
		int n = nums.length;
		for (int i = 0; i < n-1; i++) {
				int min = i;
				for (int j = i+1; j < n; j++)
					if (nums[j] < nums[min])
						min = j;
				int temp = nums[min];
				nums[min] = nums[i];
				nums[i] = temp;
		}
		return nums;
	}
	
	public static int[] insertionSort(int[] originalNums) {
		int[] nums = originalNums.clone();
		
		// TODO: Write insertion sort logic here.
		int n = nums.length;
		for (int i = 1; i < n; ++i) {
			int key = nums[i];
			int j = i - 1;
			while (j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j];
				j = j - 1;
			}
			nums[j + 1] = key;

		}
		return nums;
	}
	
	public static int[] bubbleSort(int[] originalNums) {
		int[] nums = originalNums.clone();
		
		// TODO: Write bubble sort logic here.
		
		return nums;
	}
	
	public static void printArray(int[] arr) {
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}
}
