package curso.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null){
            return;
        }
        for (double salario : salario) {
            System.out.print(salario + "  ");
        }
    }

    public void imprimeMediaSalario() {
        if (salario == null) {
            return;
        }
        double media = 0;
        for (double salario : salario) {
            media += salario;
        }
        media /= salario.length;
        System.out.println("Média Salarial " + salario);
    }
}
