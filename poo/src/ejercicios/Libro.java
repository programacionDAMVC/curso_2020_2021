package ejercicios;

public class Libro {
    //atributos: titulo, autor, ISBN
    //privados pues solo los uso en esta clase, para ver su valor fuera de la clase uso getters
    private String titulo;
    private String autor;
    //El ISBN es un número de 10 cifras con dígito de control
    //lo trato como cadena, pues ya os enseñaré a verificar la entrada, como que sean 10 caracteres,
    //que empieza por un número determinado de un país, etc y eso es mejor hacerlo con String
    //también aprenderéis a verificar ese isbn con el dígito de control, pero mas adelante
    //pongo isbn y no ISBN pues lo confundiría con una constante
    private String isbn;

    //constructor, lo hace solo el IDE con alt + insert, selecciono todos los atributos con la tecla mayúscula y
    //seleccionado el primer atributo

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    //getters y setters, igual atajo de teclado alt + insert
    //selecciono todos, para este caso

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //los setters podemos considerar que alguno no hiciera falta, pero eso depende de las especificaciones del
    //ejercicio, en este caso no dice nada, por lo que pongo todos
    //me paso a probar la clase en otra clase que tenga el método main
}
