package recursionbasics;

public class PrintNumsBothWay {

	public static void main(String[] args) {

		int n = 8;
		printNums(n);

	}

	public static void printNums(int n) {

		if (n == 0) {

			return;

		}

		System.out.println(n);
		printNums(n - 1);
		System.out.println(n);

	}

}