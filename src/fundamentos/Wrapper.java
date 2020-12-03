package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // byte
        Byte b = 100;
        short s = 1000;
        int i = Integer.parseInt(entrada.next());
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(i);
        System.out.println(s);
        System.out.println(l);

        entrada.close();

    }
}
