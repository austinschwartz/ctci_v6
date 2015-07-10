import java.util.*;

public class MagicIndex {
  public static int magicSlow(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == i)
        return i;
    }
    return -1;
  }

  public static int magicFast(int[] arr, int low, int high) {
    int pivot;
    if (high >= low) {
      pivot = low + ((high - low) / 2);
      if (arr[pivot] == pivot)
        return pivot;
      else if (arr[pivot] < pivot)
        return magicFast(arr, pivot + 1, high);
      else
        return magicFast(arr, low, pivot - 1);
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{-5, -2, 1, 3, 5, 9}; // arr[3] = 3
    int[] arr2 = new int[]{-5, -2, 1, 2, 3, 5}; // arr[5] = 5
    System.out.println(magicSlow(arr));
    System.out.println(magicFast(arr2, 0, arr2.length - 1));
  }
}
