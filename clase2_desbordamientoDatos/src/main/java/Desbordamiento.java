public class Desbordamiento {
    public static void main(String[] args) {
        int valor = Integer.MAX_VALUE;
        valor++;
        System.out.println(valor);

        valor = Integer.MIN_VALUE;
        System.out.println(valor);
    }
}
