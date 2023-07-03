import java.util.List;

public class Libro {

    private String nombre;

    private String[] capitulos;


    public Libro(){
    }

    public Libro(String nombre) {
        this.nombre = nombre;
        this.capitulos = new String[7];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(String[] capitulos) {
        this.capitulos = capitulos;
    }

    public void agregarCapitulo(int indice, String capitulo){

        capitulos[indice] = capitulo;

    }

}
