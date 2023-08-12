import java.util.Scanner;

public class Reto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto: ");
        String cadena = leer.nextLine().toLowerCase();
        int contador = 0;
        char [] caracteres =  cadena.toCharArray();
        for(char caracter: caracteres){
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contador++;
            }
        }
        System.out.println("La cadena tiene " + contador + " letras");
    }
}
