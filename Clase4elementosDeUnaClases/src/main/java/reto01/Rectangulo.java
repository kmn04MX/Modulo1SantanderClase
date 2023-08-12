package reto01;

public class Rectangulo {
    private double largo;
    private double ancho;

    public Rectangulo(){
        largo = 0;
        ancho = 0;
    }

    public Rectangulo(double largoAncho){
        this.largo = largoAncho;
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double Area(double largo, double ancho){
        return largo*ancho;
    }
}
