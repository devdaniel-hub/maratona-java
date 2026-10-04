package curso.maratonajava.javacore.introducaoclasses.test;

import curso.maratonajava.javacore.introducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Bonclair";
        professor.idade = 43;
        professor.sexo = 'F';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
