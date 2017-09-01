package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        Map<String, Integer> words = new HashMap<>();

        st = st.replace('.', ' ');

        String[] splitted = st.split(" ");

        int totalLen = 0, totalWords = 0;

        for (int i = 0; i < splitted.length; i++) {
            String word = splitted[i].trim().toLowerCase();
            if(word.length() > 0){
                if(!words.containsKey(word))
                    words.put(word, 1);
                else
                    words.put(word, words.get(word) + 1);

                totalLen += word.length();
                totalWords++;
            }
        }

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Average word length: "+(totalLen/totalWords));
    }

}
