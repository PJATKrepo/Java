public class Task12 {
    void main() {
        int a = 05224;

        String oct = Integer.toOctalString(a);
        int sum = 0;

        for (int i = oct.length() - 1; i >= 0; i--) {
            char digit = oct.charAt(i);
            System.out.println(digit);
            sum += digit - '0';
        }

        System.out.println("Sum of digits: " + sum);
    }
}