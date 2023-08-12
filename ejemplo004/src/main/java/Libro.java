public class Libro {

    private String titulo;
    private Autor autor;
    private int numPages;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString(){
        return titulo +" " + numPages + " " + autor.getNombre() + " "+ autor.getApellido() +" "+ autor.getEdad();
    }
}
