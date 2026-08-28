package curso.maratonajava.introduction;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) { // Atalho psvm
        //int, double, float, char, byte, short, lang, boolean

        /*
        Tipo primitivo = guarda um valor simples
        String não é primitivo é uma classe, e classes começam com letra Maiuscula
         */

        String nome = "Daniel Pazz";

        int idade = 18;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500; //conversão utilizando o F no final
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char sexo = 'M';

        System.out.println("Prazer " +nome);
        System.out.println("A idade é " +idade); // Atalho sout
        System.out.println(true);
        System.out.println(salarioDouble);
        System.out.println(sexo);

    }
}
