public class Task11 {
    void main() {
        int a = 0b100010010010011;
        String binary = Integer.toBinaryString(a);
        int sum = 0;

        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);
            System.out.println(bit);

            sum += bit - '0';
        }

        System.out.println("The sum of all digits: " + sum);
    }
}