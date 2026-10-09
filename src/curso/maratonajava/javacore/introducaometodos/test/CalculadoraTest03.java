package curso.maratonajava.javacore.introducaometodos.test;

import curso.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);

        calculadora.imprimeDivisao(86, 0);
    }
}
