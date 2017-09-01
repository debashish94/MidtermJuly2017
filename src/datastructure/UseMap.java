package datastructure;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
        Map<String, String> Fallclasses = new LinkedHashMap<>();

        Fallclasses.put("Computer Science", "Algorithm and Analysis");
        Fallclasses.put("Physics", "Physics 2");
        Fallclasses.put("Math", "Linear Algebra");
        Fallclasses.put("English", "Literature");
        Fallclasses.put("Sociology", "Introduction to Sociology");

        for (Map.Entry<String, String> n : Fallclasses.entrySet()) {
            System.out.println("The department is " + n.getKey());
        }
        Iterator<Map.Entry<String,String>> iterator = Fallclasses.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,String> entry = (Map.Entry<String,String>) iterator.next();
            System.out.println("Department: " + entry.getKey() + " Class: " + entry.getValue());
        }
    }
}
