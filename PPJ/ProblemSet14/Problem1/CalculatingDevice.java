public class CalculatingDevice {
    private String name;

    public CalculatingDevice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String calculate(double x, double y) {
        return name + ": " + x + " + " + y + " = " + (x + y);
    }

    public static void printRes(CalculatingDevice[] a, double x, double y) {
        for (CalculatingDevice device : a) {
            System.out.println(device.calculate(x, y));
        }
    }
}