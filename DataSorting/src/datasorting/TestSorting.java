package datasorting;

import static datasorting.DataSorting.heapSort;
import javax.swing.JOptionPane;

public class TestSorting
  {

    public static void main(String[] args)
      {
        DataSorting app = new DataSorting();
        String opNumber = (JOptionPane.showInputDialog(
                "enter the number of the sorting algorithm you want to apply  ?\n"
                + " 1- Bubble Sort.\n"
                + "2- Bubble Sort pro. \n"
                + " 3- Insertion Sort. \n"
                + "4- Selection Sort .\n"
                + "5- Quick Sort.\n"
                + "6- Merge Sort.\n"
                + "7- Heap Sort. \n"
        ));
        // know what the user need :
        switch (opNumber)
          {
            case "1":
                System.out.println("\n normal bubble sort : ");
                int[] list = DataSorting.getList();
                DataSorting.display(list);
                SelectionSort.sort(list);
                DataSorting.display(list);
                break;
            case "2":
                System.out.println("\n pro Bubble Sort : ");
                int[] list2 = DataSorting.getList();
                DataSorting.display(list2);
                BubbleSort.bubbleSort(list2, list2.length);
                DataSorting.display(list2);
                break;
            case "3":
                System.out.println("\n Insertion Sort : ");
                int[] list3 = DataSorting.getList();
                DataSorting.display(list3);
                InsertionSort.sort(list3);
                DataSorting.display(list3);
                break;
            case "4":
                System.out.println("\n Selection Sort : ");
                int[] list4 = DataSorting.getList();
                DataSorting.display(list4);
                SelectionSort.sort(list4);
                DataSorting.display(list4);
                break;
            case "5":
                System.out.println("\n Quick Sort  : ");
                int[] list5 = DataSorting.getList();
                DataSorting.display(list5);
                QuickSort.quickSort(list5, 0, list5.length - 1);
                DataSorting.display(list5);
                break;
            case "6":
                System.out.println("\n Merge Sort  : ");
                int[] list6 = DataSorting.getList();
                DataSorting.display(list6);
                MergeSort.sort(list6, 0, list6.length - 1);
                DataSorting.display(list6);
                break;
            case "7":
                System.out.println("\n Heap Sort : ");
                int[] list7 = DataSorting.getList();
                DataSorting.display(list7);
                HeapSort.sort(list7);
                DataSorting.display(list7);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wrong Option", "Error", 0);
                break;
          }
        while (true)
          {
            try
              {
                int op = Integer.parseInt(JOptionPane.showInputDialog("agian ? \n "
                        + " \t 1 - yes, i want to sort another list .\n"
                        + " \t 2 - no, stop .\n"));
                switch (op)
                  {
                    case 1:
                        main(args);
                        break;
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Wrong Option", "Error", 0);
                  }
              }
            catch (Exception e)
              {
                JOptionPane.showMessageDialog(null, "Wrong Option", "Error", 0);
              }
          }
      }

  }
