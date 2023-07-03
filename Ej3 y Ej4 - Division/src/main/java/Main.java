/*
Ej3- Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.

Ej4- Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String n1, n2;
        int num1, num2;

        try {
            System.out.print("Ingrese el 1er numero: ");
            n1 = leer.next();

            System.out.print("Ingrese el 2do numero: ");
            n2 = leer.next();

            try {
                num1 = Integer.parseInt(n1);
                num2 = Integer.parseInt(n2);

                DivisionNumero dn = new DivisionNumero();

                try {
                    System.out.println("El resultado es : " + dn.division(num1, num2));
                } catch (ArithmeticException a) {
                    System.out.println("ERROR, no se puede dividir por cero");
                }

            } catch (NumberFormatException nf) {
                System.out.println("ERROR, no puede convertirse a entero");
            }

        } catch (InputMismatchException im) {
            System.out.println("ERROR, No se ingresaron caracteres numericos");
        }
    }
}
