package curso.maratonajava.introduction;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, long, int, float, double 0
        // char '\u0000' '  '
        // boolean false
        // String null

        String [] nomes = new String[3];
        nomes [0] = "Naruto";
        nomes [1] = "Luffy";
        nomes [2] = "Gon";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
