package datasorting;

public class HeapSort
  {

    /**
     * A complete binary tree :
     * is a binary tree in which every level
     * (except possibly the last), is completely filled,
     * and all nodes are as far left as possible .
     * <p>
     * A Binary Heap :
     * is a Complete Binary Tree where items are stored in a special order
     * such that the value in a parent node is greater(or smaller) than
     * the values in its two children nodes.
     * The former is called max heap and the latter is called min-heap.
     * The heap can be represented by a binary tree or array.
     * <p>
     * Why array based representation for Binary Heap?
     * Since a Binary Heap is a Complete Binary Tree,
     * it can be easily represented as an array ,
     * and the array-based representation is space-efficient.
     * If the parent node is stored at index [k],
     * the left child can be calculated by 2 * k + 1 and
     * the right child by 2 * k + 2 (assuming the indexing starts at 0).
     * <p>
     * the heapify :
     * is the process of reshaping a binary tree into a Heap data structure.
     * <p>
     * A binary tree :
     * is a tree data structure that has two child nodes at max.
     * If a node’s children nodes are ‘heapified’,
     * then only ‘heapify’ process can be applied over that node.
     * A heap should always be a complete binary tree.
     * <p>
     * Time Complexity: Time complexity of heapify is O(Logn).
     * Time complexity of createAndBuildHeap() is O(n)
     * and the overall time complexity of Heap Sort is O(nLogn).
     * <p>
     * Advantages of heapsort :
     * <p>
     * – Efficiency –
     * The time required to perform Heap sort increases logarithmically
     * while other algorithms may grow exponentially slower
     * as the number of items to sort increases.
     * <p>
     * Memory Usage –
     * Memory usage is minimal because
     * apart from what is necessary to hold the initial list of items to be sorted,
     * it needs no additional memory space to work.
     * <p>
     * Simplicity –
     * It is simpler to understand than other equally efficient sorting algorithms
     * because it does not use advanced computer science concepts such as recursion.
     */

    static void sort(int arr[])
      {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
          {
            heapify(arr, n, i);
          }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--)
          {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
          }
      }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heapify(int arr[], int n, int i)
      {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
          {
            largest = l;
          }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
          {
            largest = r;
          }

        // If largest is not root
        if (largest != i)
          {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
          }
      }

   

  }
