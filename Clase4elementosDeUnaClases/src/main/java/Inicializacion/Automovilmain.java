package Inicializacion;

public class Automovilmain {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Ford", "Shelby",1965, 3432);
        Automovil auto2 = new Automovil("Buggati", "Veyron",2009, 10000);



        System.out.println("Ford".hashCode()); //Hascode se calcula depende de los atributos de las clases
        System.out.println("Shelby".hashCode());

        //System.out.println(auto.equals(auto2));
        System.out.println(auto.hashCode());
        String x = "Hola";

        System.out.println(x.hashCode());
    }
}
