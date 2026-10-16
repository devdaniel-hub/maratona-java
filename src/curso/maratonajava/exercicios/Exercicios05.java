package curso.maratonajava.exercicios;
// Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de
// um usuário, calcule quantos salários mínimos esse
// usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.600,21).

import java.util.Scanner;

public class Exercicios05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o Salário mínimo: ");
        double salarioMin = input.nextDouble();
        System.out.println("Digite o seu Salário: ");
        double salarioUsuario = input.nextDouble();
        double calculoSalario = salarioUsuario / salarioMin;

        System.out.println("Você recebe " + calculoSalario + " de Salário Mínimo");

    }
}
