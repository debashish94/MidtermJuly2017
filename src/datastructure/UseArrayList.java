package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> arrayList= new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);

		for (Integer x: arrayList){
			System.out.println(x);
		}
		System.out.println("The size of the array is " + arrayList.size());

		arrayList.remove(1);

		for (Integer x: arrayList){
			System.out.println(x);
		}
		System.out.println("The updated size of the array is " + arrayList.size());

		Iterator it = arrayList.iterator();
		while(it.hasNext()){
			System.out.println("Using iterator the numbers of array are " + it.next());
		}
		ConnectDB connectDB = new ConnectDB();
		connectDB.InsertDataFromArrayListToMySql(arrayList, "Array", "Numbers");
		connectDB.readDataBase("Array", "Numbers");

	}

}
