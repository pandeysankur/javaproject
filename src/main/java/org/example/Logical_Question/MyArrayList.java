package Logical_Question;

import java.util.Arrays;

public class MyArrayList {
    int[] values = new int[10];
    int index = 0;

    public void add(int i) {
        values[index] = i;
        index++;

        if (values.length == index) {
            int i1 = values.length * 2;
            int[] newArray = new int[i1];
            for (int i2 = 0; i2 < values.length; i2++) {
                newArray[i2] = values[i2];
            }
            values = newArray;
        }
    }
    public void remove(int j){

        int []newArray2=new int[values.length-1];
        for (int k=0;k<j-1;k++){
            newArray2[k]=values[k];
        }
            for (int l=j;l>j;l++){
                newArray2[l]=values[l];
            }
            values = newArray2;
    }


    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}
