package datasorting;

/**
 *
 * @author MooD
 */
public class SelectionSort
  {

    /**
     * The selection sort algorithm sorts an array by
     * repeatedly finding the minimum element (considering ascending order)
     * from unsorted part and putting it at the beginning.
     * <p>
     * The algorithm maintains two subarrays in a given array.
     * 1) The subarray which is already sorted.
     * 2) Remaining subarray which is unsorted.
     * <p>
     * In every iteration of selection sort,
     * the minimum element (considering ascending order)
     * from the unsorted subarray is picked and moved to the sorted subarray.
     */
    static void sort(int arr[])
      {
        int n = arr.length;
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++)
          {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
              {
                if (arr[j] < arr[min_idx])
                  {
                    min_idx = j;
                  }
              }
            // Swap the found minimum element with the first element 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
          }
      }

  }
