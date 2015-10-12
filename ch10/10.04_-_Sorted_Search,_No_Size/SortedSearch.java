public class SortedSearch {
  public static int search(int[] arr, int val) {
    int index = 1;
    while (index < arr.length && arr[index] < val) {
      index *= 2;
    } 
    return binarySearch(arr, val, index / 2, index);
  }

  public static int binarySearch(int[] arr, int val, int low, int high) {
    int mid;
    while (low <= high) {
      mid = low + (high - low) / 2;
      if (mid > arr.length - 1 || arr[mid] > val)
        high = mid - 1;
      else if (arr[mid] < val)
        low = mid + 1;
      else
        return mid;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(search(new int[]{1, 2, 5, 8, 24, 35}, 24));
    System.out.println(search(new int[]{1, 2, 5, 8, 24, 35}, 1));
    System.out.println(search(new int[]{1, 2, 5, 8, 24, 35}, 35));
  }
}
