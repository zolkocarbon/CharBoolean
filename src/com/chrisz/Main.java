package com.chrisz;

public class Main {

    public static void main(String[] args) {
	// characters, numbers, and special symbols, one character max
        // width of 16 (2 bytes)
        char myChar = '\u00AE';
        System.out.println(myChar);

        // https://unicode-table.com/en/#control-character
        // unicode character, example would be copyright symbol, 00A9
        // char copyright = '\u00A9'; ©

        boolean myBoolean = true;
    }
}
