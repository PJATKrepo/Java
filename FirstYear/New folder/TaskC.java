public class TaskC {
	void main() {
		int n = 232;
		
		for (int k = 1; k < 9; k++) {
			int m = 1 << k;
			if ((n & m) == 0) {
				IO.println("The byte on position " + k + " = 0");
			} else {
				IO.println("The byte on position " + k + " = 1");
			}
		}
	}
}