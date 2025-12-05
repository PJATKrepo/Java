public class Problem1 {
    void main() {
        CalculatingDevice[] arr = {
                new Computer("Cray"),
                new CalculatingDevice("Abacus"),
                new Calculator("HP")
        };

        CalculatingDevice.printRes(arr, 21, 7);
    }
}