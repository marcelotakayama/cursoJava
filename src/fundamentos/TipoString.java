package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        String nome = "Marcelo";
        String sobrenome = "Takayama";
        int idade = 19;
        double salario = 900.00;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n");

        // %s -> String         %d -> int         %f float/double
        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
    }
}
