import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

            System.out.println("Bienvenido al juego PIEDRA, PAPEL O TIJERA");

            boolean seguirJugando=true;
            while(seguirJugando){
            String elementoJugador = elegirElementoJugador();
            String elementoComputadora = elegirElementoComputadora();
            System.out.println("LA COMPUTADORA ELEGIÓ: " + elementoComputadora);
            quienGana(elementoJugador, elementoComputadora);
            seguirJugando= elegirSiQuiereSeguirJugando();
            }

        System.out.println("has salido del juego");
    }

    private static boolean elegirSiQuiereSeguirJugando() {
        System.out.println("Desea Seguir Jugando?? presione: 1 para SEGUIR/ (cualquier otra tecla) para SALIR");
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            return true;
        } else {
            return false;
        }

    }

    private static void quienGana(String eleccionJugador, String eleccionComputadora) {
        if (eleccionJugador.equals(eleccionComputadora)) {
            System.out.println("es un empate ");
        } else if (eleccionJugador.equals("piedra") && eleccionComputadora.equals("tijera") ||
                eleccionJugador.equals("tijera") && eleccionComputadora.equals("papel") ||
                eleccionJugador.equals("papel") && eleccionComputadora.equals("piedra")) {

            System.out.println("GANASTE!!");

        }else {
            System.out.println("PERDISTE! :( ");
    }

    }
    private static String elegirElementoComputadora() {
        String[] opciones = {"piedra", "papel", "tijera"};
        Random random = new Random();
        int indiceAleatorio = random.nextInt(opciones.length);
        String eligeComputadora = opciones[indiceAleatorio];
        return eligeComputadora;
    }
    private static String elegirElementoJugador() {
        System.out.println("Elige una opcion: PIEDRA, PAPEL O TIJERA : ");
        String eligeJugador= scanner.next().toLowerCase();
        return eligeJugador;
    }

}