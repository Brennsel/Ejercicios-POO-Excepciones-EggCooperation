/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */

import java.util.Scanner;

public class MainJuego {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        Juego juego = new Juego();

        int numero;
        boolean adivino = false;

        System.out.println(">>>Adivina el numero secreto entre 1 y 500");
        System.out.println(">>Tenes 10 intentos");

        while (!adivino && juego.getNumeroIntentos() < 10) {

            try {
                System.out.println("--------------------------------------------------");
                System.out.println("Intento numero:  " + (juego.getNumeroIntentos() + 1));
                System.out.print(">Ingrese un numero: ");
                numero = leer.nextInt();
                adivino = juego.adivinarNumero(numero);
                if (!adivino) {
                    System.out.println("No adivino el numero secreto");
                    if (numero > juego.getNumeroSecreto()) {
                        System.out.println("El numero secreto es menor");
                    } else {
                        System.out.println("El numero secreto es mayor");
                    }
                }

            } catch (Exception e) {
                System.out.println("ERROR, no ingreso un caracter numerico, " + e.getMessage());
                leer.nextLine();
                juego.setNumeroIntentos(juego.getNumeroIntentos()+1);
            }

        }

        if (adivino) {
            System.out.println("Ganaste! Adivinaste en " + juego.getNumeroIntentos() + " intentos");
        } else {
            System.out.println("Fin del juego. El numero secreto era: " + juego.getNumeroSecreto());
        }
    }
}
