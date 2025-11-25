public class Problem1 {
    void main()
    {
        boolean isFemale = false;
        final String gender = isFemale ? "Women" : "Man";
        System.out.println(gender);

        boolean isYoung = true;
        final String g = (isFemale ? (isYoung ? "Girl" : "Women") : (isYoung ? "Boy" : "Man"));
        System.out.println(g);
    }
}