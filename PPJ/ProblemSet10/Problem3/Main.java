import java.util.Arrays;

public class Main {
    void main () {
        System.out.println("Wait...");

        System.out.println("Fibonacci Tests");
        System.out.println("FiboR(45): " + FuncStat.fiboR(45));
        System.out.println("FiboI(45): " + FuncStat.fiboI(45));

        System.out.println("Factorial Tests");
        System.out.println("FactR(12): " + FuncStat.factR(12));
        System.out.println("FactI(12): " + FuncStat.factI(12));

        System.out.println("GCD Tests");
        System.out.println("GCDR(12125, 40643): " + FuncStat.gcdR(12125,40643));
        System.out.println("GCDI(12125, 40643): " + FuncStat.gcdI(12125,40643));

        int[] a = {3, 8, 2, 9, 7, 4};
        System.out.println("Max : " + FuncStat.maxElem(a,0));
        System.out.println("Num even: " + FuncStat.numEven(a,0));

        System.out.println("Reverse Test");
        System.out.println("Before: " + Arrays.toString(a));
        FuncStat.reverse(a,0);
        System.out.println("After : " + Arrays.toString(a));

        System.out.println("Palindrome Tests");
        System.out.println("Is 'radar' a palindrom? " +
                FuncStat.isPalindrom("radar"));
        System.out.println("Is 'abba' a palindrom? " +
                FuncStat.isPalindrom("abba"));
        System.out.println("Is 'rover' a palindrom? " +
                FuncStat.isPalindrom("rover"));
    }
}