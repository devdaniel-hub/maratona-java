package curso.maratonajava.introduction;

public class Aula06EstruturaRepeticaoExercicio02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000

        // atalho fori

        for (int i = 0; i < 1000000; i++) {
            if ((i & 2) == 0) {
                System.out.println(i);
            }
        }
    }
}