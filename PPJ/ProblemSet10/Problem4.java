class Problem4 {
    void main() {
        int testSex = 1;
        int testMarit = 3;
        int testAge = 2;
        int testEdu = 3;
        int testPlace = 0;
        int testRegion = 12;
        int testAnswer = 6;

        short encodedCode = encode(testSex, testMarit, testAge, testEdu, testPlace, testRegion, testAnswer);

        System.out.println("--- Encoding Test ---");
        System.out.println("Encoded short value (decimal): " + encodedCode);

        System.out.println("\n--- Decoding Test ---");
        info(encodedCode);
    }

    public static short encode(int sex, int marit,
                               int age, int edu,
                               int place, int region,
                               int answer) {

        short code = 0;

        code |= (short)answer;
        code |= (short)(region << 3);
        code |= (short)(place << 7);
        code |= (short)(edu << 9);
        code |= (short)(age << 11);
        code |= (short)(marit << 13);
        code |= (short)(sex << 15);

        return code;
    }

    public static void info(short code) {
        final short ANSWER_MASK = 0b111;
        final short REGION_MASK = 0b1111;
        final short TWO_BITS_MASK = 0b11;
        final short SEX_MASK = 0b1;

        int answer = code & ANSWER_MASK;

        int region = (code >> 3) & REGION_MASK;

        int place = (code >> 7) & TWO_BITS_MASK;

        int edu = (code >> 9) & TWO_BITS_MASK;

        int age = (code >> 11) & TWO_BITS_MASK;

        int marit = (code >> 13) & TWO_BITS_MASK;

        int sex = (code >> 15) & SEX_MASK;

        System.out.println("sex: " + sex);
        System.out.println("marital status: " + marit);
        System.out.println("age group: " + age);
        System.out.println("education: " + edu);
        System.out.println("living place: " + place);
        System.out.println("region: " + region);
        System.out.println("answer: " + answer);
    }
}