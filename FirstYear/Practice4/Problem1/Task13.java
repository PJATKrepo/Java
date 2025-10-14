public class Task13 {
    void main() {
        int a = 0xF10;

        String hex = Integer.toHexString(a).toUpperCase();
        int sum = 0;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char digit = hex.charAt(i);
            System.out.println(digit);
            sum += Character.digit(digit, 16);
        }

        System.out.println("Sum of digits: " + sum);
    }
}