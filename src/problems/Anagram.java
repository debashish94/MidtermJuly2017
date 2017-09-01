package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String a = "TAAR", b = "RAAT";

        a = a.toLowerCase();
        b = b.toLowerCase();

        boolean anagram = a.length() == b.length();

        for (int i = 0; anagram && i < a.length(); i++) {
            char c = a.charAt(i);

            boolean found = false;
            for (int j = 0; j < b.length(); j++) {
                if(b.charAt(j) == c){
                    b = b.substring(0, j) + b.substring(j+1);
                    found = true;
                    break;
                }
            }

            if(!found){
                anagram = false;
                break;
            }

        }


        System.out.println(anagram ? "Yes" : "No");
    }
}
