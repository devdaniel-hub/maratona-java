package curso.maratonajava.javacore.introducaometodos.test;

import curso.maratonajava.javacore.introducaometodos.dominio.Calculadora;

import static curso.maratonajava.javacore.introducaometodos.dominio.Calculadora.somaDoisNumeros;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        //Calculadora calculadora = new Calculadora();
        int resultadoSoma = somaDoisNumeros(10,10);
        System.out.println(resultadoSoma);
        //calculadora.subtraiDoisNumeros();
    }
}
