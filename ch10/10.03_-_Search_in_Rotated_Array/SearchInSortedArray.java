import java.util.*;

public class SearchInSortedArray {
  public static int search(int[] nums, int low, int high, int num) {
    int mid = low + (high - low)/2;
    if (num == nums[mid])
      return mid;

    if (high < low)
      return -1;

    // left is ordered
    if (nums[low] < nums[mid]) {
      if (num >= nums[low] && num < nums[mid])
        return search(nums, low, mid - 1, num);
      else
        return search(nums, mid + 1, high, num);
    } else if (nums[mid] < nums[low]) {
    // right is ordered
      if (num > nums[mid] && num <= nums[high])
        return search(nums, mid + 1, high, num);
      else
        return search(nums, low, mid - 1, num);
    } else { // left half is all duplicates or small array
      if (nums[mid] != nums[high]) {
        return search(nums, mid+1, high, num);
      } else {
        int ret = search(nums, low, mid-1, num);
        if (ret != -1)
          return ret;
        return search(nums, mid + 1, high, num);
      }
    }
  }

  public static void main(String[] args) {
    int[] array1 = new int[]{10, 15, 20, 5};
    System.out.println(search(array1, 0, 3, 5)); // 3
    int[] array2 = new int[]{50, 5, 20, 30, 40};
    System.out.println(search(array2, 0, 4, 50)); // 0
    int[] array3 = new int[]{15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
    System.out.println(search(array3, 0, 11, 5)); // 8
  }
}
