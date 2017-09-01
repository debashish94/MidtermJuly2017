package problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String s = "racecar";

        boolean palindrome = true;
        for (int i = 0; palindrome && i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                palindrome = false;
            }
        }

        System.out.println(palindrome ? "Palindrome" : "Not a palindrome");
    }
}
