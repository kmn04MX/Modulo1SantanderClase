public class OrientacionObjetos {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNombre("Marjane");
        autor.setApellido("Setrapi");
        autor.setEdad(50);

        Libro libro =  new Libro(); //SE crea una instancia
        libro.setTitulo("Persepolis");
        libro.setNumPages(368);
        libro.setAutor(autor);

        System.out.println("Los datos son: " + libro.toString());
    }
}
