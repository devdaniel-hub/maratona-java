package curso.maratonajava.exercicios;

//Faça um algoritmo que leia os valores de A, B, C e em
// seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int numA = input.nextInt();

        System.out.println("Digite um valor: ");
        int numB = input.nextInt();

        System.out.println("Digite um valor: ");
        int numC = input.nextInt();

        int soma = numA + numB;

        if (soma < numC){
            System.out.println(soma + " é menor que " + numC);

        } else if (soma == numC){
            System.out.println(soma + " é igual a " + numC);
        } else {
            System.out.println(soma + " é maior que " + numC);
        }

    }
}
