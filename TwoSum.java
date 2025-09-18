class TwoSum {

    public int[] twosums(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr; // Return immediately after finding the pair
                }
            }
        }
        return arr; // Default return if no pair is found
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = ts.twosums(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}