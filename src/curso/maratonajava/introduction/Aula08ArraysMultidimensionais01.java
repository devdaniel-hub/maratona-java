package curso.maratonajava.introduction;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [] [] dias = new int[3] [3];
        dias [0] [0] = 30;
        dias [0] [1] = 20;
        dias [0] [2] = 10;

        dias [1] [0] = 5;
        dias [1] [1] = 25;
        dias [1] [2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias [i].length; j++) {
                System.out.println(dias[i] [j]);
                break;

            }

        }
        System.out.println("___________");

        for (int [] arrBase:dias){
            for (int num: arrBase){
                System.out.println(num);
            }

        }
    }
}
