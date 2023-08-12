public class TiposDeDato {
    public static void main (String [] args){
        //Valores numéricos enteros
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt =1;
        long vaorLong = 1L;

        //Valores númericos decimal
        float valorFloat = 1.56F;
        double valorDouble = 1.56;

        //Boolean
        boolean valorFalse = false;
        boolean valorTrue = true;

        //caracteres
        //char valorChar  =''; No existe el valor vacio, siempre se debe asignar un valor
        char valorChar = 'B';




        //Casting ---> Cambiar el tipo de dato de un valor, al hacer un caso en el siguiente ejemplo, ignora cualquier decimal, solo toma la parte entera
        int num = valorInt + (int)(valorFloat);

        System.out.println("El valor del número es: " + num);

        //Java si puede hacer casting con tipos de valores tipo char
        //Java no permite hacer casting con tipos de valor tipo booleano
    }
}
