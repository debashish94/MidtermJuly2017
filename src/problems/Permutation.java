package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("", "ABCD");
    }
    public static void permutation (String current, String s){
        int n = s.length();

        if (n==0){
            System.out.println(current);

        }else{
            for (int i =0; i<n; i++){
                permutation(current + s.substring(i, i+1), s.substring(0,i) + s.substring(i+1));
            }
        }
    }
}
