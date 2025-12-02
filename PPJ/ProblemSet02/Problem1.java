public class Problem1 {
    void main() {
        int a = 37, b = 98;

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("(a >> 1) & b = " + ((a >> 1) & b));
        System.out.println("(a << 2) ^ (b >> 2) = " + ((a << 2) ^ (b >> 2)));
        System.out.println("a & ~(b >> 3) = " + (a & ~(b >> 3)));
    }
}