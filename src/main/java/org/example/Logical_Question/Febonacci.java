package Logical_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Febonacci {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();



        int n = 10, a = 0, b = 1;
        while (a <= n) {
            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
        }
//        for (int i =0;i<n;i++){
//            int c = a + b;
//            a = b;
//            b = c;
//            System.out.print("10 Element:"+" "+c);
//        }


    }

}

