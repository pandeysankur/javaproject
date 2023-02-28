package org.example.dataStructure;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = { 15, 9, 7, 13, 12, 16, 4 };
        int leng = a.length;
        QuickSort arr = new QuickSort();
        arr.quickSort(a, 0, leng - 1);
        arr.printArray(a);
    }

    int partition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (a[i] <= pivot && i < h) {
                i++;
            }
            while (a[j] >= pivot && j > l) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[l] = a[j];
        a[j] = pivot;
        return j;
    }

    void quickSort(int[] a, int l, int h) {
        if (l < h) {
            int pi = partition(a, l, h);
            quickSort(a, l, pi - 1);
            quickSort(a, pi + 1, h);
        }
    }

    void printArray(int a[]) {
        for (int i : a) {
            System.out.println(i);
        }
    }
}
