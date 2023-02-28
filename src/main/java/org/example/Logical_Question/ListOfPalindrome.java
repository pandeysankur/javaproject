package Logical_Question;

import java.util.ArrayList;
import java.util.List;

public class ListOfPalindrome {

    public static void main(String[] args) {
        String word = "amalayalamas";
        List<String> newList = new ArrayList();

        for (int i = 2; i <= word.length(); i++) {

            String s = getString(0, i, word);
            System.out.println(s);
            String rev=reverse(s);
            if(rev.equals(s)){
                newList.add(s);
            }
        }
        System.out.println(newList);
    }
    private static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
    private static String getString(int startIndex, int endIndex, String word) {
        return word.substring(startIndex, endIndex);
    }
}