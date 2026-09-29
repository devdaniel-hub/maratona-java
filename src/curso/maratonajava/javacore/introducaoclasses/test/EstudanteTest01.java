package curso.maratonajava.javacore.introducaoclasses.test;

import curso.maratonajava.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome + estudante.idade + estudante.sexo);

    }
}
