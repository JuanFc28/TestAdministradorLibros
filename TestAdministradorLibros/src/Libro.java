class Libro {
    private String titulo;
    private String autor;
    private String ISBN;

    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getTitulo(String titulo){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public String toString(){
        String libro = titulo + " por " + autor + " - ISBN: " + ISBN + "\n";
        return libro;
    }
    // Getters, Setters y el método toString()...
}
