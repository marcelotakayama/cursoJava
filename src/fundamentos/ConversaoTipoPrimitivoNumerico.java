package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        // Conversão implícita
        double a = 1;
        System.out.println(a);

        // Conversão explícita (CAST)
        float b = (float) 1.12345;
        System.out.println(b);

        // Conversão explícita (CAST)
        int c = 340;
        byte d = (byte) c;
        System.out.println(d);

        // Conversão explícita (CAST)
        double e = 1.99999;
        int f = (int) e;
        System.out.println(f);
    }
}
