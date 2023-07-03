/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */

public class ArrayMain {
    public static void main(String[] args) {

        Libro libro = new Libro("Caperucita");

        try{
            libro.agregarCapitulo(8, "Resumen final");
        } catch (ArrayIndexOutOfBoundsException io){
            System.out.println("Error de tipo fuera de rango: " + io.getMessage());
        }

    }
}
