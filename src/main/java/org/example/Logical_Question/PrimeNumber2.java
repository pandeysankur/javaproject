package Logical_Question;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber2 {
    public static void main(String[] args) {
            int i = 0;
            int num = 0;
            List<Integer> list = new ArrayList<Integer>();

            for (i = 1; i <= 10; i++) {
                int counter = 0;
                for (num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2||counter/2==0) {
                    list.add(i);
                }



            }
            System.out.println("Prime Numbers from 100 to 200 are ::" + list);
    }
}
