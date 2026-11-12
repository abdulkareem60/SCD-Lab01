package testing;

public class JUnitTesting {

	// returns the square of a number
	public int square(int x) {
		return x * x;
	}

	// counts how many times character c appears in str
	public int countA(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	}
}
