package Herencia;

public class Figura {
    private final double BASE;
    private final double ALTURA;

    public Figura(double base, double altura){
        BASE=base;
        ALTURA = altura;
    }

    public double getBASE() {
        return BASE;
    }

    public double getALTURA() {
        return ALTURA;
    }

    public void mostrarDimension(){
        System.out.println("La base es: " + getBASE() + "La altura es: " + getALTURA());
    }
}
