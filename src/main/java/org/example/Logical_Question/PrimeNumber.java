package Logical_Question;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        List<Integer> list = new ArrayList<Integer>();

        for (i = 100; i <= 200; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                list.add(i);
            }

        }
        System.out.println("Prime Numbers from 100 to 200 are ::" + list);
        List<Integer> newList = new ArrayList();
        for (int k = 0; k < list.size(); k++) {
            int m = list.get(k);
            String s = "";
            while (m != 0) {
                int a = m%10;
                m = m/10;
                s = s + a;
            }
            if(list.get(k) == Integer.parseInt(s)) {
                newList.add(list.get(k));
            }

        }

        System.out.println(newList);
    }
}
