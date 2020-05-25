package fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        String s = "Texto";
        s = s.toUpperCase();
        System.out.println(s);

        // Wrapper é a versão objeto dos tipos primitivos
        int a = 123;
        System.out.println(a);
    }
}
