public class Calificaciones {
    public static void main (String [] args){
        double calificacion = 8.5;

        if(calificacion == 10){
            System.out.println("Excelente");
        }else if (calificacion >= 8 && calificacion<=9){
            System.out.println("Muy bien");
        }else if(calificacion >= 7 && calificacion<8){
            System.out.println("Bien hecho");
        }else if(calificacion >=6 && calificacion<7){
            System.out.println("Pasaste");
        }else {
            System.out.println("Mejor vuelve a intentarlo");
        }
    }
}
