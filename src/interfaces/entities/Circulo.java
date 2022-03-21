package interfaces.entities;

public class Circulo implements AreaCalculavel {
    private double diametro;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calcularArea() {
        double raio = diametro / 2;
        return Math.PI * Math.pow(raio, 2);
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
