package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);
        System.out.println("Marcelo".toUpperCase());

        String y = ("Bom dia X".replace("X", "Marcelo").concat("!!!"));
        System.out.println(y);
    }
}
