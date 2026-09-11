package core.basics;

public class Task80 {
    public static void main(String[] args) {
        int[] nums = {5, 5, 4, 3, 3, 1};
        System.out.println(array(nums));
    }

    public static int[] array(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                size++;
            }
        }

        int[] result = new int[size];

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }
}
