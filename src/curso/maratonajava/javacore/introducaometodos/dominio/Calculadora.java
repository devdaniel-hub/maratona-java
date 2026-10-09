package curso.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros (){
        System.out.println(110 + 50);
    }

    public void subtraiDoisNumeros(){
        System.out.println(700 - 425);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros(double num1 , double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
    public double divideDoisNumeros02(double num1 , double num2){
        if (num2 != 0){
            return num1 / num2;
        }
        return 0;
    }
    public void imprimeDivisao(double num1 , double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
        } else {
            System.out.println(num1 / num2);
        }
    }
}
