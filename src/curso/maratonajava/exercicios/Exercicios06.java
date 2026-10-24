package curso.maratonajava.exercicios;

//Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%

import java.util.Scanner;

public class Exercicios06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = input.nextInt();

        double resultado = valor + valor * 0.05;
        System.out.println("O valor de " + valor + " foi reajustado " + resultado);
    }
}
