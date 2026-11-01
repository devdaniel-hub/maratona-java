package curso.maratonajava.javacore.introducaometodos.test;

import curso.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Daniel");
        pessoa.setIdade(-1);
       // pessoa.Imprime();
        System.out.println(pessoa.getNome());
    }
}
