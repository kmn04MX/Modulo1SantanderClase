package Inicializacion;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;

    //BLoque de inicialización, siempre que se instancia una clase, se ejecuta el bloque de inicialización
    //Se puede definir más de un bloque se inicialización
    {
        System.out.println("Estoy vivo");
        curso = "Java SE I";
        sesion = 4;
        objetivo = "Dominar java";
    }

    {
        System.out.println("HOLAAAAAAAAAAAAAA");
        curso = "Java Standar Edition I";
    }
    public String getCurso() {
        return curso;
    }

    public byte getSesion() {
        return sesion;
    }

    public String getObjetivo() {
        return objetivo;
    }
}
