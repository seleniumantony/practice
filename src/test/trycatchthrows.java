package test;

public class trycatchthrows {

	static void display() throws Exception {
		throw new IllegalAccessException("Holy sprit");
	}

	public static void main(String[] args) {
		try {
			display();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
