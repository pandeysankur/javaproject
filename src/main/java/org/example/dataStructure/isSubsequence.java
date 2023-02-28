package dataStructure;

public class isSubsequence {
    public static boolean isSubsequence(int[] a, int[] b) {
        int c = 0;
        for (int i = 0; i < b.length && c < a.length; i++) {
            if (b[i] == a[c]) {
                c++;
            }
        }
        return c == a.length;
    }

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 3, 9 };
        boolean isSubsequence = isSubsequence(b, a);
        System.out.println(isSubsequence);
    }
}
