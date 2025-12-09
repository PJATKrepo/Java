public class IllDyspepsia extends Patient {
    public IllDyspepsia(String name) {
        super(name);
    }

    @Override
    public String illness() {
        return "dyspepsia";
    }

    @Override
    public String treatment() {
        return "coal";
    }
}