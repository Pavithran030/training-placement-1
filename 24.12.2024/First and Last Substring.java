import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int size=s.length()-k+1;
        String[] store=new String [size];
        
        for (int i = 0; i < size; i++) {
            store[i] = s.substring(i, i + k);
        }

        for (int i = 0; i < store.length - 1; i++) {
            for (int j = 0; j < store.length - i - 1; j++) {
                if (store[j].compareTo(store[j + 1]) > 0) {
                    String temp = store[j];
                    store[j] = store[j + 1];
                    store[j + 1] = temp;
                }
            }
        }

        smallest = store[0];
        largest = store[size - 1];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
