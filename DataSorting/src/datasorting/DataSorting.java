package datasorting;

import javax.swing.JOptionPane;
public class DataSorting
{
   
    private static int[] list;
    private static int elementsNumber;
    private static int leftElement;
    private static int rightElement;
   
    public static int [] getList()
    {
        elementsNumber = Integer.parseInt(
            JOptionPane.showInputDialog(
                "how many element you what to sort ?"));
//        System.out.print("how many element you what to sort ? :  ");
//        elementsNumber = new Scanner(System.in).nextInt();
        list = new int[elementsNumber];
        for (int i = 0;i < elementsNumber;i++)
        {
             list[i]= Integer.parseInt(
            JOptionPane.showInputDialog(
                "enter a number "));
//            System.out.print("enter an element : ");
//            list[i] = new Scanner(System.in).nextInt();
//            System.out.print(" ");
        }
        return list;
    }
    
    public static void display(int[] list)
    {
//        System.out.print("the elements are : ");
//        String arr = "";
        for (int i = 0;i < list.length;i++)
        {
//            arr  = list[i] + "      " +arr;
            System.out.print(list[i] + "   "); 
            JOptionPane.showMessageDialog(null,list[i] );
        }
//        JOptionPane.showMessageDialog(null,arr );
        System.out.println("");
       
    }
    
    public static void bubbleSort(int[] list)
    {
        for(int j = 0 ; j <list.length ;j++)
        {
            for (int i = 0;i < list.length - 1;i++)
            {
                if (list[i] > list[i + 1])
                {
                    swap(list, list[i], list[i+1]);
                }
            }
        }
//        System.out.print("after sorting : ");
//        display(list);
    }
    
    public  static void bubbleSortPro(int [] arr, int n)
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

            // IF no two elements were 
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
        System.out.print("after sorting : ");
        display(arr);
    }

    /*   Algorithm :
        To sort an array of size n in ascending order: 
        1: Iterate from arr[1] to arr[n] over the array. 
        2: Compare the current element (key) to its predecessor. 
        3: If the key element is smaller than its predecessor, 
            * compare it to the elements before. 
            * Move the greater elements one position up
            * to make space for the swapped element.
   */
    // similar to the way you sort playing cards in your hands.
    public static void insertionSort(int[] list)
    {
        int n = elementsNumber;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
        System.out.print("after sorting : ");
        display(list);
    }

    public static void selectionSort(int[] list)
    {
        // One by one move boundary of unsorted subarray.
        for (int i = 0;i < elementsNumber - 1;i++)
        {
            int minIndex = indexOfmin(list, i, elementsNumber);
             // Swap the found minimum element with the first element:
            swap(list, i,minIndex);
        }
        System.out.print("after sorting : ");
        display(list);
    }
// it's part of the selection method
    public static int indexOfmin(int[] list, int i, int elementsNumber)
    {
        // Find the minimum element in unsorted array
        int minIndex = i;
        for (int j = i;j < elementsNumber;j++)
        {
            if (list[j] < list[minIndex])
            {
                minIndex = j;
            }
        }
        int indexOfMin = minIndex;
        return indexOfMin;
    }
    // this is another way to do it :
    public static void selectionSortOnePiece(int[] arr )
    {
        int n = elementsNumber;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            swap(arr, min_idx, i);
        }
        display(arr);
    }

    public static void quickSort(int[] list , int low , int high)
    {
        
         if (low < high)
        {
            int partitionIndex = partition(list,low,high);
            // sort the element berfore the partition index
            quickSort(list, low, partitionIndex -1);
            // sort the elements after the partition index
            quickSort(list, partitionIndex +1, high);
            
        }   
         System.out.print("after sorting : ");
         display(list);
        
    }
    /* This function takes last element as pivot, places
   the pivot element at its correct position in sorted
   array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot */
    //pert of the quick sort :
    public static int partition(int[] list, int leftElement, int rightElement)
    {
        int pivot = list[rightElement];
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (leftElement - 1);
        for (int j = leftElement; j <= rightElement-1;j++)
        {
            // If current element is smaller 
            // than the pivot
            if(list[j] < pivot)
            {
                // Increment index of 
                // smaller element
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i+1, rightElement);
        return ( i + 1);
    }
    
    /*
     * It divides the input array into two halves,
     * calls itself for the two halves, 
     * and then merges the two sorted halves. 
     */
    public static void mergeSort(int []list ,int low,int high)
    {
        if(high > low)
        {
            // find the middle :
            int middlePoint = low + (high - low)/2;
            // sort first half :
            mergeSort(list, low, middlePoint);
            //sort second half :
            mergeSort(list, middlePoint+1, high);
            // merge the two halves:
            merge(list , low,middlePoint,high);
        }
        System.out.print("after the sort :");
        display(list);
    }
    
    /*
     *  used for merging two halves. 
     * The merge(list[],low,middlePiont,high) is a key process that assumes that :
            * list[low..middlePoint] and list[middlePoint+low..high] are sorted 
            * then it merges the two sorted sub-arrays into one.
      */
    
       public static void merge(int[] list, int low, int middlePoint, int high)
    {
        // size for the temp lists :
        int lowListSize = middlePoint - 1 + low;
        int highListSize = high - middlePoint;
        // temp arrays :
        int tempLowList[] = new int[lowListSize];
        int tempHighList[] = new int[highListSize];
        // copy elements to tempLowList
        for (int i = 0;i < lowListSize;++i)
        {
            tempLowList[i] = list[low + i];
        }
        //copy elements to tempHighList
        for (int i = 0;i < highListSize;++i)
        {
            tempHighList[i] = list[high + 1 + i];
        }
        // merging process :
        int indexOfFirstSubList = 0;
        int indexOfSecondSubList= 0;
        int indexOfmergedSubList = low;
        
        while (indexOfFirstSubList < lowListSize &&
                indexOfSecondSubList < highListSize)
        {
            if (tempLowList[indexOfFirstSubList] <=
                    tempHighList[indexOfSecondSubList])
            {
                list[indexOfmergedSubList] = tempHighList[indexOfSecondSubList];
                indexOfFirstSubList++;
            }
            else
            {
                list[indexOfmergedSubList] = tempHighList[indexOfSecondSubList];
                indexOfSecondSubList++;
            }
            indexOfmergedSubList++;
        }
        // Copy remaining elements of tempLowList[] :
        while (indexOfFirstSubList < lowListSize ) 
        {
            list[indexOfmergedSubList] = tempLowList[indexOfFirstSubList];
            indexOfFirstSubList++;
            indexOfmergedSubList++;
        }
        // Copy remaining elements of tempHighList[] :
        while(indexOfSecondSubList < highListSize)
        {
            list[indexOfmergedSubList] = tempHighList[indexOfSecondSubList];
            indexOfSecondSubList++;
            indexOfmergedSubList++;
        }
    }
    
       /*
        * Heap Sort Algorithm for sorting in increasing order: 
            1. Build a max heap from the input data. 
            2. At this point, the largest item is stored at the root of the heap.
            * Replace it with the last item of the heap followed by reducing the size of heap by 1.
            * Finally, heapify the root of the tree. 
            3. Repeat step 2 while the size of the heap is greater than 1.
        
        *see (note for sorting) document for the info
        */
       public static void heapSort(int [] list)
       {
           int n = list.length;
           //rearrange :
           for (int i = n / 2 - 1;i >= 0; i--)
           {
               heapify(list , n , i);
           }
           // get element from the heap :
           for (int i = n - 1; i > 0; i--) {
               //move : root --> end
               swap(list[0], list[i]);
                heapify(list, i, 0);
           }
           System.out.print("after sorting");
           display(list);
       }
       /*
        * i : index of list[] {root}
        * n : size of heap
        * to heapify a subtree rooted with node i:
        */
       public static void heapify(int [] list , int n , int i)
       {
           int largest =i ;
           int left = 2 * i +1;
           int right =2 * i +2;
           // if lest side is larger than the root :
           if ( left < n && list[left] > list[largest])
           {
               largest = left;
           }
           // if the right side is larger than the root :
           if (right < n && list[right] > list[largest])
           {
               largest = right;
           }
           // if the largest is not the root :
           if (largest != i) 
           {
               swap(list, list[i], list[largest]);
           }
           // loop
           heapify(list, n, largest);
       }
       
         // this swap two numbers in the given array :
        public static void swap(int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        public static void swap(int a , int b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

}