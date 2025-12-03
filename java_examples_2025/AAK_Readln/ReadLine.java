public class ReadLine {
    public static void main(String[] args) {
        String fname = IO.readln();
        IO.println("Hi, " + fname);
        String lname = IO.readln("and your last name? ");
        IO.println("Hi, " + fname + " " + lname);
    }
}
