import java.util.ArrayList;

class AdministradorLibros {
    private ArrayList<Libro> biblioteca = new ArrayList<>();
    public void agregarLibro(Libro libro){
        biblioteca.add(libro);
    }

    public void eliminarLibroPorISBN(String ISBN){
        boolean removed = false;
        for (int i = 0; i < biblioteca.size(); i++) {
            if(biblioteca.get(i).getISBN().equals(ISBN)){
                biblioteca.remove(i);
                removed = true;
                break; // Sale del ciclo si encuentra el libro
            }
        }
    
        if (removed) {
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("No se encontró un libro con el ISBN especificado.");
        }
    }
    public void mostrarLibros(){
        System.out.println("\nEstos son los libros de la biblioteca: ");
        for (int i = 0; i < biblioteca.size(); i++) {
        System.out.println(biblioteca.get(i).toString());
        }
    }
    // Métodos agregarLibro, eliminarLibroPorISBN, mostrarLibros...
}

