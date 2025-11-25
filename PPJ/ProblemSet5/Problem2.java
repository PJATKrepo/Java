import java.util.Scanner;

public class Problem2 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a1 a2 b1 b2 (separated by spaces): ");
        int a1 = 2;
        int a2 = 4;
        int b1 = 1;
        int b2 = 6;

        int aLow = Math.min(a1, a2);
        int aHigh = Math.max(a1, a2);
        int bLow = Math.min(b1, b2);
        int bHigh = Math.max(b1, b2);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        boolean inA = (x >= aLow) && (x <= aHigh);
        boolean inB = (x >= bLow) && (x <= bHigh);

        boolean inAminusB = inA && !inB;
        boolean inBminusA = inB && !inA;
        boolean inIntersection = inA && inB;
        boolean inUnion = inA || inB;
        boolean inSymDiff = inA ^ inB;

        System.out.println("\nInterval A = [" + aLow + ", " + aHigh + "]");
        System.out.println("Interval B = [" + bLow + ", " + bHigh + "]");
        System.out.println("Enter x " + x);
        System.out.println("x in A:\t\t\t\t\t" + inA);
        System.out.println("x in B:\t\t\t\t\t" + inB);
        System.out.println("x in A\\B:\t\t\t\t" + inAminusB);
        System.out.println("x in B\\A:\t\t\t\t" + inBminusA);
        System.out.println("x in intersection of A and B:\t\t" + inIntersection);
        System.out.println("x in union of A and B:\t\t\t" + inUnion);
        System.out.println("x in sym. diff. of A and B:\t\t" + inSymDiff);
    }
}