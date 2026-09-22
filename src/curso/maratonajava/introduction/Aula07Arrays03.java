package curso.maratonajava.introduction;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        int [] numeros2 = new int [] {1,2,3};

        /* for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }*/
        for (int num : numeros2){
            System.out.println(num);
        }

    }
}
