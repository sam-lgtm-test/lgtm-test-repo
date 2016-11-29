package test;

class Main {

	public String foo;
	public String bar;
	private String baz;

	public static void main(String[] args) {
		System.out.println("Hello World" + new Main().baz);
		System.out.println("Hello World" + new Main().baz);
		System.out.println("Hello World" + new Main().baz);

		String s = "";
		for (int i = 0; i < 10; i++) {
			s += "foo";
		}
	}

}
