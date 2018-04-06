package com.infotech.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		List<String> personList = new ArrayList<>();
		personList.add("Sam");
		personList.add("Andy");
		personList.add("Sean");
		personList.add("Jash");
		personList.add("Amy");
		personList.add("Martin");
		personList.add("Joseph");
		personList.add("Amy");

		Collections.sort(personList);
		System.out.println("After Sorting personList::");
		System.out.println(personList);
		
		//1.specified object using the binary search algorithm.
		int binarySearch = Collections.binarySearch(personList, "Martin");
		System.out.println("Index of the searched key: " + binarySearch);

		//2.Returns an unmodifiable view of the specified collection.
		Collection<String> unmodifiableCollection = Collections.unmodifiableCollection(personList);
		System.out.println("Unmodifiable Collection:::");
		System.out.println(unmodifiableCollection);

		 //unmodifiableCollection.add("KK");//Will throw
		// java.lang.UnsupportedOperationException at RunTime

		//3.Returns a synchronized (thread-safe) list backed by the specified list.
		List<String> synchronizedList = Collections.synchronizedList(personList);
		System.out.println("synchronized List:: ");
		System.out.println(synchronizedList);

		System.out.println("-------------------------------------");

		List list = new ArrayList();
		list.add("KK");
		list.add("PK");
		list.add("MP");
		list.add(21);
		list.add(34.00);
		//4.Returns a dynamically typesafe view of the specified collection.
		Collection checkedCollection = Collections.checkedCollection(list, String.class);
		System.out.println("Checked list content: " + checkedCollection);
		// you can add any type of elements to list object
		list.add(10);
		// you cannot add any type of elements to checkedCollection object, doing so throws ClassCastException
		//checkedCollection.add(10); 

		//5.Returns an immutable list containing only the specified object.
		List<String> singletonList = Collections.singletonList("Admin");
		//singletonList.add("Manager");//It will throw java.lang.UnsupportedOperationException at runtime
		
		System.out.println(singletonList);
	}
}
