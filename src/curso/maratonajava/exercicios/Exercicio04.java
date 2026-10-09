package curso.maratonajava.exercicios;

//Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
//deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer
// um dos cálculos deve-se atribuir
//o resultado a uma variável C e imprimir seu valor na tela.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int numA = input.nextInt();
        System.out.println("Digite outro valor: ");
        int numB = input.nextInt();
        int numCsoma = numA + numB;
        int numCmultiplicacao = numA * numB;

        if (numA == numB){
            System.out.println("A soma dos valores " + numCsoma);
        } else {
            System.out.println("A multiplicação dos valores " + numCmultiplicacao);
        }


    }
}
