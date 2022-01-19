package datasorting;

/**
 *
 * @author MooD
 */
public class InsertionSort
  {

    /**
     * Insertion sort :
     * is a simple sorting algorithm that works similar to
     * the way you sort playing cards in your hands.
     * <p>
     * The array is virtually split into a sorted and an unsorted part.
     * Values from the unsorted part are picked and placed
     * at the correct position in the sorted part.
     * <p>
     * Algorithm To sort an array of size n in ascending order:
     * 1: Iterate from arr[1] to arr[n] over the array.
     * 2: Compare the current element (key) to its predecessor.
     * 3: If the key element is smaller than its predecessor,
     * compare it to the elements before.
     * Move the greater elements one position up to
     * make space for the swapped element.
     * <p>
     * Insertion sort takes maximum time to sort
     * if elements are sorted in reverse order.
     */
    static void sort(int arr[])
      {
        int n = arr.length;
        for (int i = 1; i < n; ++i)
          {
            int key = arr[i];
            int j = i - 1;
            /* Move elements of arr[0..i-1], that are greater than key,
             * to one position ahead of their current position */
            while (j >= 0 && arr[j] > key)
              {
                arr[j + 1] = arr[j];
                j = j - 1;
              }
            arr[j + 1] = key;
          }
      }

  }
