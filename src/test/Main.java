package test;

import java.util.Arrays;

class Main {

	public String foo;
	public String bar;
	private String baz;

	public static void main(String[] args) {
		System.out.println("Hello World" + new Main().baz);
		System.out.println("Hello World" + new Main().baz);
		System.out.println("Hello World" + new Main().baz);

		System.out.println(concat(Arrays.asList("foo", "bar", "baz")));
	}

	public static String concat(Iterable<String> strings) {
		String s = "";
		for(String str : strings) {
			s += " " + str;
		}
		return s;
	}

}
