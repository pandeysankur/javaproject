package dataStructure;

public class countDuplicate {

    public static int countDuplicate(int items1[], int items2[]) {
        int count = 0;
        for (int i = 0; i < items1.length; i++) {
            for (int j = 0; j < items2.length; j++) {
                if (items1[i] == items2[j]) {
                    count++;
                }
            }

        }

        return count;

    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        int[] b = {1, 4, 5, 6, 10};

        int evenCount = countDuplicate.countDuplicate(a, b);
        System.out.println(evenCount);
    }

}

	
	
	
	

