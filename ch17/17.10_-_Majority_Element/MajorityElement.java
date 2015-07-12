public class MajorityElement {
  public static int majority(int[] nums) {
    int count = 1;
    int majorityIndex = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[majorityIndex])
        count++;
      else
        count--;
      if (count == 0) {
        majorityIndex = i;
        count = 1;
      }
    }
    return nums[majorityIndex];
  }
  public static void main(String[] args) {
    System.out.println(majority(new int[]{1, 2, 5, 5, 9, 5, 5, 3, 2}));
  }
}
