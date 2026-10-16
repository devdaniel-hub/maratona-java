package curso.maratonajava.javacore.introducaometodos.test;

import curso.maratonajava.javacore.introducaometodos.dominio.Calculadora;

// A variável original nunca é alterada, quando estamos passando as variaveis
// dentro do metodo, criamos uma cópia

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro de CalculadoraTest04");
        System.out.println(num1);
        System.out.println(num2);

    }
}
