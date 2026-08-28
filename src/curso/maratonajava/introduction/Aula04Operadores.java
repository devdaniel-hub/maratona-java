package curso.maratonajava.introduction;

public class Aula04Operadores {

    public static void main(String[] args) {
        // (soma+), (subtração-), (divisão/), (multiplicação*)
        int n1 = 365;
        int n2 = 237;
        double resultado = n1 - n2;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorIgualVinte = 10 >= 20;
        boolean isDezMenorIgualVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("isDezIgualVinte " + isDezIgualVinte);

        // && (AND) || (or)

        int idade = 25;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario >= 2500;
        System.out.println(isDentroDaLei);

        double valorTotalCorrente = 200;
        double valorTotalPoupança = 5000;
        float valorPlayCinco = 5000F;
        boolean isPlayCincoCompravel = valorTotalCorrente > valorPlayCinco || valorTotalPoupança >= valorPlayCinco;

        System.out.println(isPlayCincoCompravel);

    }
}
