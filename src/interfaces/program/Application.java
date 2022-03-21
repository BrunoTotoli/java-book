package interfaces.program;

import interfaces.entities.AreaCalculavel;
import interfaces.entities.Circulo;
import interfaces.entities.Quadrado;
import interfaces.entities.Retangulo;

public class Application {

    public static void main(String[] args) {

        AreaCalculavel quadrado = new Quadrado(4);
        double quadradoArea = quadrado.calcularArea();
        System.out.println(quadradoArea);

        AreaCalculavel circulo = new Circulo(5);
        double circuloArea = circulo.calcularArea();
        System.out.println(circuloArea);

        AreaCalculavel retangulo = new Retangulo(3, 2);
        double retanguloArea = retangulo.calcularArea();
        System.out.println(retanguloArea);
    }

}
