package curso.maratonajava.exercicios;

// Faça um algoritmo para receber um número qualquer e imprimir na tela
// se o número é par ou ímpar, positivo ou negativo

import java.util.Scanner;

public class Exercicios02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        if (numero >0){
            System.out.println("Número positivo " + numero);
        } else if (numero <0){
            System.out.println("Número negativo " + numero);
        }
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }


    }
}
