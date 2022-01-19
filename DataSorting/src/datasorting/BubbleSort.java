package datasorting;

/**
 *
 * @author MooD
 */
public class BubbleSort
  {

    /**
     * Bubble Sort is the simplest sorting algorithm
     * that works by repeatedly swapping the adjacent elements
     * if they are in wrong order.
     * <p>
     * it takes minimum time (Order of n) when elements are already sorted.
     */
   static void bubbleSort(int arr[])
      {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
          {
            for (int j = 0; j < n - i - 1; j++)
              {
                if (arr[j] > arr[j + 1])
                  {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                  }
              }
          }
      }

    /*
     * Optimized Implementation:
     * The above function always runs O(n^2) time
     * even if the array is sorted.
     * It can be optimized by :
     * stopping the algorithm if inner loop didn’t cause any swap.
     */
    // An optimized version of Bubble Sort 
    static void bubbleSort(int arr[], int n)
      {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
          {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
              {
                if (arr[j] > arr[j + 1])
                  {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                  }
              }
            if (swapped == false)
              {
                break;
              }
          }
      }

  }
