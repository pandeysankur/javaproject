package dataStructure;

import java.util.Arrays;

public class BinarySearchUsingOneLoop {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int li = 0;
        int hi = a.length;
        int mi = (li + hi) / 2;

        int b[] = new int[mi];
        int c[] = new int[a.length - mi];

        for (int i = 0; i < a.length; i++) {
            if (i < mi) {
                b[i] = a[i];
            } else {
                c[i - mi] = a[i];
            }
        }

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}








