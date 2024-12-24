# Overview
This repository contains Java implementations of common sorting algorithms. The main goal of this project is to provide clear and efficient implementations of various sorting techniques, as well as a testing mechanism to compare their performance and correctness. The following sorting algorithms are included in the repository:
1. BubbleSort
2. HeapSort
3. InsertionSort
4. MergeSort
5. QuickSort
6. SelectionSort
Additionally, a test class TestSorting.class is provided to validate the functionality of each sorting algorithm.

# Sorting Algorithms
## 1. BubbleSort
BubbleSort is a simple comparison-based algorithm where adjacent elements are repeatedly swapped if they are in the wrong order. This process continues until no swaps are needed.

## 2. HeapSort
HeapSort is based on the binary heap data structure. It first builds a max-heap and then repeatedly extracts the maximum element from the heap and places it at the end of the list. The heap is rebuilt after each extraction.

## 3. InsertionSort
InsertionSort builds the sorted portion of the list one element at a time. It picks elements from the unsorted part of the list and places them in the correct position within the sorted part.

## 4. MergeSort
MergeSort is a divide-and-conquer algorithm that splits the list into halves, sorts each half recursively, and then merges the sorted halves into one sorted list.

## 5. QuickSort
QuickSort is another divide-and-conquer algorithm. It selects a 'pivot' element, partitions the list into elements smaller than the pivot and elements larger than the pivot, and then recursively sorts the two partitions.

## 6. SelectionSort
SelectionSort repeatedly selects the minimum element from the unsorted part of the list and swaps it with the first unsorted element. This process continues until the list is sorted.

## TestSorting
```TestSorting.class``` is a test class that validates the correctness and performance of all the implemented sorting algorithms. 

## TODO in The test class:
1. Generates a random list of integers to test the sorting algorithms.
2. Runs each sorting algorithm on the same list of numbers.
3. Compares the results to ensure correctness.
4. Measures the time taken by each algorithm to sort the list.


# Usage

## Compile the classes: To compile the sorting classes, use the following command:
``` javac *.java ```

## Run the test class: To run the tests and see the sorting algorithms in action, use the following command:
``` java TestSorting ```

# Output: The TestSorting class will output the sorted lists for each algorithm,(TODO: as well as the time taken for each sorting operation).

# Contributing
Feel free to fork the repository and contribute improvements or additional sorting algorithms. You can create a pull request for any changes you want to propose.

# License
This repository is open source and available under the MIT License.
