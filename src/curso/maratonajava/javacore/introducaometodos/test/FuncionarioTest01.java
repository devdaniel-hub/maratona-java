package curso.maratonajava.javacore.introducaometodos.test;

import curso.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Daniel Machado";
        funcionario.idade = 21;
        funcionario.salario = new double [] {2700, 3200.97, 2900};
        funcionario.imprime();
        funcionario.imprimeMediaSalario();

    }
}
