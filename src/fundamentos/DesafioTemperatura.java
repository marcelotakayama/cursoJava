package fundamentos;

public class DesafioTemperatura {
    public static void main(String[] args) {
        // (Fº - 32) * 5/9 Cº
        double farenheit = 180;
        final double ajuste = 32;
        final double conversao = 5.0/9;

        double celsius = (farenheit - ajuste) * conversao;

        System.out.println(farenheit + " Fº = " + celsius + " Cº");
    }
}
