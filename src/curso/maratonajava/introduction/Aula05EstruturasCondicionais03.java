package curso.maratonajava.introduction;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operador Ternário
        // (condicao) ? verdadeiro : falso;

        double salario = 6000;
        String resultado = salario > 5000 ? "Eu vou doar para instituição!" : "Não vou doar hoje, somente quando tiver condições";
        System.out.println(resultado);
    }
}