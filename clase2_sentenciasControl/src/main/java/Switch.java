public class Switch {
    public static void main(String[] args) {

        String mensaje;
        byte calificacion = 8;

        switch (calificacion){ //El switch ejecuta en cascada
            case 10:
                mensaje = "¡Excelente!";
                break;
            case 9:
                break;
            case 8:
                mensaje = "Muy bien";
                break;
            case 7:
                mensaje = "Bien hecho";
                break;
            case 6:
                mensaje = "Pasaste";
                break;
            default:
                mensaje="No entraste en nigun caso";
                break;
        }

        String mes = "Julio";
        switch (mes){//si el switch no tiene el break, se ejecuta todo en cascada
            case "Enero":
                System.out.println("Febrero");
            case "Febrero":
                System.out.println("Marzo");
            case "Marzo":
                System.out.println("Abril");
            case "Abril":
                System.out.println("Mayo");
            case "Mayo":
                System.out.println("Junio");
            case "Junio":
                System.out.println("Julio");
            case "Julio":
                System.out.println("Agosto");
            case "Agosto":
                System.out.println("Septiembre");
            case "Septiembre":
                System.out.println("Octubre");
            case "Octubre":
                System.out.println("Noviembre");
            case "Noviembre":
                System.out.println("Diciembre");
            case "Diciembre":
                System.out.println("Enero");
            default:
                System.out.println("El año termino");


        }
    }
}
