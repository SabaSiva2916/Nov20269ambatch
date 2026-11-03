package org.sample;

public class SampleTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

		String s = "Java Selenium";
		String output = "";
		String[] split = s.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {
			output = output + split[i]+" ";
		}

		System.out.println(output);

	}
}
