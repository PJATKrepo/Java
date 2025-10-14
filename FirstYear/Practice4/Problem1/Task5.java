public class Task5 {
	void main() {
		boolean a = false;
		boolean b = false;
		
		IO.println(a && b);
		IO.println(a || b);
		IO.println(a ^ b);
		IO.println();
		
		a = true;
		b = false;
		
		IO.println(a && b);
		IO.println(a || b);
		IO.println(a ^ b);
		IO.println();
		
		a = false;
		b = true;
		
		IO.println(a && b);
		IO.println(a || b);
		IO.println(a ^ b);
		IO.println();
		
		a = true;
		b = true;
		
		IO.println(a && b);
		IO.println(a || b);
		IO.println(a ^ b);
		IO.println();
	}
}