public class Letras {
    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Hola mundo");
        String texto = lector.leerEntrada();

        Contador contador = new Contador();
        int numV = contador.cuentaVocales(texto);
        int numN = contador.cuentaNumeros(texto);
        int numC = contador.cuentaConsonante(texto);
        int numS = contador.cuentaSimmbolo(texto);

        lector.muestraMensaje("Hay " + numV + " Vocales");
        lector.muestraMensaje("Hay " + numN + " Vocales");
        lector.muestraMensaje("Hay " + numC + " Vocales");
        lector.muestraMensaje("Hay " + numS + " Vocales");
    }
}
