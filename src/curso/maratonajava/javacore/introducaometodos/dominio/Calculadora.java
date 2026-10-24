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

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);

    }

    //Desafio: Criar uma calculadora que válida se um número é primo ou não
    //Retornar true se for e false se não for

    //Criar uma calculadora que recebe uma lista,
    //Retorna toda a lista x2
}
