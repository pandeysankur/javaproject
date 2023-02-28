package dataStructure;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int li = 0;
        int hi = a.length;
        int mi = (li + hi) / 2;

        int b[] = new int[mi];
        for (int i = 0; i <= mi-1; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(b));

        int c[] = new int[a.length-mi];
        int j = 0;
        for (int i = mi ; i <= a.length-1; i++) {
           c[j] = a[i];
           j++;
        }
        System.out.println(Arrays.toString(c));
    }
}
