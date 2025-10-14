public class Task10 {
	void main() {
		int a = 38471;
		int buff;
		int sum = 0;
		
		while (a != 0) {
			buff = a % 10;
			sum += buff;
			a = a / 10;
			IO.println(buff);
		}
		IO.println("sum of all digits = " + sum);
	}
}