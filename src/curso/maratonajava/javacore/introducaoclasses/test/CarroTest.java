package curso.maratonajava.javacore.introducaoclasses.test;

import curso.maratonajava.javacore.introducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "BMW";
        carro.modelo = "X5";
        carro.ano = 2025;

        carro2.nome = "Porshe";
        carro2.modelo = "Cayene";
        carro2.ano = 2026;

        // Referência de objetos.  carro = carro2;

        System.out.println(carro.nome + " " + carro.modelo);
        System.out.println(carro.ano);

        System.out.println(carro2.nome + " " + carro2.modelo);
        System.out.println(carro2.ano);
    }
}
