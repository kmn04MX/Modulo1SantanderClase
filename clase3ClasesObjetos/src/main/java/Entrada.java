import java.util.*;

public class Entrada {
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = leer.nextLine(); // Espera el usuario a que escriba algo, espera una línea
        System.out.println("Mi nombre es: " + nombre);
    }
}
