package org.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SampleTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

		List<String> li = new ArrayList<String>();
		li.add("Java");
		li.add("Selenium");
		li.add("Python");
		li.add("C#");
		li.add("Playwright");

		// Iterate these list using ListIterator
		ListIterator<String> ll = li.listIterator();
		while (ll.hasNext()) {
			String string = ll.next();
			System.out.println(string);
		}

	}
}
