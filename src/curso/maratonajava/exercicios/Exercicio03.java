package curso.maratonajava.exercicios;
// Faça um algoritmo que receba um número inteiro e
// imprima na tela o seu antecessor e o seu sucessor

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = input.nextInt();

        int antecessor = num -1;
        int sucessor = num +1;

        System.out.println(num + " esse é o antecessor " + antecessor);
        System.out.println(num + " esse é o sucessor " + sucessor);
    }
}