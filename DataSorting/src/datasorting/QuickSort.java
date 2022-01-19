package datasorting;

/**
 *
 * @author MooD
 */
public class QuickSort
  {

    /**
     * QuickSort is a Divide and Conquer algorithm.
     * It picks an element as pivot and partitions the given array
     * around the picked pivot.
     * <p>
     * : The best case occurs when :
     * the partition process always picks the middle element as pivot. 
     * The worst case occurs when :
     * the partition process always picks greatest or smallest element as pivot.
     * <p>
     * The key process in quickSort is partition().
     * Target of partitions is, given an array and an element x of array as pivot,
     * put x at its correct position in sorted array
     * and put all smaller elements (smaller than x) before x,
     * and put all greater elements (greater than x) after x.
     * All this should be done in linear time.
     * <p>
     * partition algorithm :
     * start from the leftmost element and keep track of index of smaller
     * (or equal to) elements as i.
     * While traversing, if we find a smaller element,
     * we swap current element with arr[i].
     * Otherwise we ignore current element.
     */
    // A utility function to swap two elements 
    static void swap(int[] arr, int i, int j)
      {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }

    /**
     * This function takes last element as pivot,
     * places the pivot element at its correct position in sorted array,
     * and places all smaller (smaller than pivot) to left of pivot
     * and all greater elements to right of pivot
     */
    static int partition(int[] arr, int low, int high)
      {
        // pivot
        int pivot = arr[high];
        // Index of smaller element ,
        // and indndicates the right position of pivot found so far 
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++)
          {
            // If current element is smaller  than the pivot 
            if (arr[j] < pivot)
              {
                i++;
                swap(arr, i, j);
              }
          }
        swap(arr, i + 1, high);
        return (i + 1);
      }

    /**
     * The main function that implements QuickSort
     * arr[] --> Array to be sorted,
     * low --> Starting index,
     * high --> Ending index
     */
    static void quickSort(int[] arr, int low, int high)
      {
        if (low < high)
          {
            // pi is partitioning index, arr[p] is now at right place 
            int pi = partition(arr, low, high);
            // Separately sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
          }
      }

  }
