package curso.maratonajava.javacore.introducaometodos.test;

import curso.maratonajava.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        estudante01.Imprime();
        estudante02.Imprime();
    }
}
