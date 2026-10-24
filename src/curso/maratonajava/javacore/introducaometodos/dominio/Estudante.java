package curso.maratonajava.javacore.introducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    // Refêrencia com this
    public void Imprime (){
        System.out.println("___________");
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
