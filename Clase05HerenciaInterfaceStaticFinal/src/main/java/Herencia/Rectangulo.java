package Herencia;

public class Rectangulo extends Figura{

    public Rectangulo(double base, double altura){
        super(base, altura);
    }

    public double area(){
        return  getBASE()*getALTURA();
    }
}
