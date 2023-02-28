package dataStructure;

public class Shorting {
    public static void main(String[] args) {
        int[] myArray = insringsort(new int[]{9,8,2,4,4,21,1,2,1});
        for (int j : myArray) {
            System.out.println(j);
        }
    }

    private static int[] insringsort(int[] a) {
        for (int i=0;i<a.length;i++){
            int element=a[i];
            int j=i-1;
            while (j>=0 && a[j]>element){
                a[j+1]=a[j];
                j--;

            }
            a[j+1]=element;
        }
        return a;
    }


}
