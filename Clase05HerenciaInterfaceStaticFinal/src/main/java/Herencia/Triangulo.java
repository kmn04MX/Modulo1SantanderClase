package Herencia;

public class Triangulo extends  Figura{
    private final String TIPO;

    public Triangulo(double base, double altura, String tipo){
        super(base, altura); //super hacer referencia al constructor de la super clase
        TIPO = tipo; //No se usa this porque el nombre de las variables son diferentes, en Java el nombre de las variables es sensible a mayusculas

    }

    public double area(){
        return  getALTURA()*getBASE()/2;
    }
}
