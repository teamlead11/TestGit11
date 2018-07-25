package testpack;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testcase2(5, 4);
		testcase2(5, 4, 6);
		testcase2("a", "b", "c");
	}

	public static void testcase2(int a, int b) {
		System.out.println("this is my test case2");
		int c = a + b;
		System.out.println(c);

	}

	public static void testcase2(int a, int b, int c) {
		System.out.println("this is my test case1");
		int d = a + b + c;
		System.out.println(d);
	}

	public static void testcase2(String a, String b) {
		System.out.println("this is my test case1");
		String d = a + b;
		System.out.println(d);
	}

	public static void testcase2(String a, String b, String c) {
		System.out.println("this is my test case1");
		String d = a + b + c;
		System.out.println(d);
	}
}
