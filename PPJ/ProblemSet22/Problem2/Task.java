public abstract class Task {
    double x, y;

    protected Task(double a, double b) {
        x = a;
        y = b;
    }

    public double execute() {
        throw new UnsupportedOperationException();
    }

    public static Task getInstance(String oper, double a, double b) {
        switch (oper) {
            case "+": return new Adder(a, b);
            case "-": return new Subtractor(a, b);
            case "*": return new Multiplier(a, b);
            case "/": return new Divider(a, b);
            default: return null;
        }
    }
}

class Adder extends Task {
    public Adder(double a, double b) { super(a, b); }
    @Override public double execute() { return x + y; }
}

class Subtractor extends Task {
    public Subtractor(double a, double b) { super(a, b); }
    @Override public double execute() { return x - y; }
}

class Multiplier extends Task {
    public Multiplier(double a, double b) { super(a, b); }
    @Override public double execute() { return x * y; }
}

class Divider extends Task {
    public Divider(double a, double b) { super(a, b); }
    @Override public double execute() { return x / y; }
}