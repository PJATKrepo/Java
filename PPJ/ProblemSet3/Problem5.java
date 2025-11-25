public class Problem5 {
    void main() {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                int k = j * i;
                System.out.printf("%5d", k);
            }
            System.out.println();
        }
    }
}