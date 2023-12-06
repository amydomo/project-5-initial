package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        int position = 0;

        while (position < data.length) {
            if (position == 0 || data[position].compareTo(data[position - 1]) >= 0) {
                position++;

            } else {
                swap(data, position, position - 1);
                position--;
            }
        }
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {

        boolean swapped;
        do {
            swapped = false;

            for (int i = 0; i < data.length - 1; i++) {
                //scans array left to right
                if (data[i].compareTo(data[i + 1]) > 0) {
                    //Swap elements if they are in the wrong order
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }
            //exits the outer loop here if no swaps occurred
            if (!swapped) {
                break;
            }

            swapped = false;
            for (int i = data.length - 2; i >= 0; i--) {
                //scans array right to left
                if (data[i].compareTo(data[i + 1]) > 0) {
                    //Swap elements if they are in the wrong order
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }

        } while (swapped); //if no elements have been swapped, then the list is sorted
}

    public static <T extends Comparable<T>> void shellSort(T[] data) {



    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}




