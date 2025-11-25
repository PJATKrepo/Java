import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
    void main() {
        Scanner sc =  new Scanner(System.in);

        int min_am = 1;
        int max_am = 1;

        System.out.print("Enter the number - ");
        int buff = sc.nextInt();
        int min_num = buff;
        int max_num = buff;

        while (true) {
            System.out.print("Enter the number (Enter 0 to stop) - ");
            try {
                buff = sc.nextInt();
                if (buff == 0) { break; }
                if (buff > max_num) { max_num = buff; max_am = 1; }
                else if (buff == max_num) { max_am++; }
                else if (buff < min_num) { min_num = buff; min_am = 1; }
                else if  (buff == min_num) { min_am++; }

            } catch (InputMismatchException e) { System.out.print("Input valid number!"); }
        }
        System.out.println("min number - " + min_num + ", " + min_am + " times");
        System.out.println("max number - " + max_num + ", " + max_am + " times");
    }
}