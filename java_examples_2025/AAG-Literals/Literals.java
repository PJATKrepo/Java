void main() {
    IO.println(22);         // decimal
    IO.println(022);        // octal
    IO.println(0x22);       // hexadecimal
    IO.println(0b1001);     // binary
    IO.println(22.22);      // double
    IO.println(2.22e-1);    // "scientific"
    IO.println(1/3 );       // this is 0 !
    IO.println(1/3.);       // one third
    IO.println(1/3D);       // 3D -> double
    IO.println(2147483648L);// long
    IO.println(2147483647  + 1 ); // ooops!
    IO.println(2147483647L + 1 );
    IO.println('A');        // char
    IO.println('A'+2);      // char
    IO.println((char)('A'+2));
    IO.println('\u0042');   // also char
    IO.println("Hello, World");
    IO.println("\u017b\u00F3\u0142w");
    IO.println("number = " +  2+2);
    IO.println("number = " + (2+2));
    IO.println(false);
    IO.println(2*3 == 6);
    IO.println("\"TAB\"s and 'NL'\n"+
                "a\tb\tc\te\tf\n\tg\th\ti\tj");
    IO.println("C:\\Program Files\\java");
}
