import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        /*IF-ELSE
        Imagina que estás organizando una fiesta de cumpleaños sorpresa para tu mejor
        amigo. Quieres asegurarte de que todos los invitados cumplan con ciertas
        condiciones de edad para que la fiesta sea un éxito.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Introduce la edad del invitado: ");
        int edadInvitado= scanner.nextInt();

        if (edadInvitado >= 20 && edadInvitado <= 30) {
            System.out.println("Puedes invitarlo!!");
        } else {
            System.out.println("no cumple con los requisitos de edad.");
        }*/




        /*SWITCH-CASE
        Escribe un programa en Java que determine el tipo de comida a servir en una fiesta
        de cumpleaños basándose en el número de invitados.
        1: Se servirá una tarta personalizada.
        5: Se preparará un pastel de cumpleaños.
        20: Se ofrecerá una gran tarta para compartir.
        En otros casos: Se dispondrá de una variedad de aperitivos y platos.

        System.out.println("Introduce la cantidad de invitados:");

        int numeroInvitados= scanner.nextInt();
        String tipoComida;

        switch (numeroInvitados){
            case 1:
                tipoComida="una tarta personalizada";
                break;
            case 5:
                tipoComida="un pastel personalizado";
                break;
            case 20:
                tipoComida="una tarta para compartir";
                break;
            default:
                tipoComida="varios platos";

        }

        System.out.println("la comida del cumpleaños será " + tipoComida);
*/

        /*DO WHILE
        El primer programa que quieres desarrollar simula una máquina expendedora de
        caramelos. Sabes que en la fiesta habrá muchos niños, y quieres tener una forma
        divertida de distribuir caramelos entre ellos. Entonces, decides crear un
        programa que simule la venta de caramelos. La idea es que la máquina expendedora
        venda caramelos automáticamente hasta que se hayan vendido todos los caramelos
        que tienes para ofrecer.



        int caramelosDisponibles= 50;

        do {
            System.out.println("hay " + caramelosDisponibles + " disponibles");
            System.out.println("Cuantos caramelos deseas comprar? (Presiona 0 para salir)");
            int caramelosComprar = scanner.nextInt();

            //Verificar si se puede comprar caramelos.

            if (caramelosComprar > 0 && caramelosComprar <= caramelosDisponibles) {
                System.out.println("Disfruta tus caramelos");
                // caramelosDisponibles -= caramelosComprar;
                caramelosDisponibles = caramelosDisponibles - caramelosComprar;

            } else if (caramelosComprar > caramelosDisponibles) {
                System.out.println("lo siento, no tengo tantos caramelos.");

            } else {
                System.out.println("Gracias por visitar nuestra maquina de caramelos");
                caramelosDisponibles=0;
            }
        } while (caramelosDisponibles > 0);

        System.out.println("Fin del programa");

*/
        /* WHILE
        La sala está llena de globos de colores. En un rincón, hay una caja con 10
        globos y una nota que dice:"¡Estalla los globos y encuentra la sorpresa!".
        Juan está emocionado y comienza a estallar los globos uno por uno.
        Cada vez que estalla uno, todos aplauden y se divierten. Después de estallar
        varios globos, encuentra una nota que dice: "¡Feliz cumpleaños, Juan!
        ¡Gracias por ser tan genial!".

        int globosEstallados=0;

        System.out.println( "Bienvenido, estalla los globos y encuentra la sorpresa");

        while(globosEstallados<10) {
            System.out.println("pum! Globo estallado");
            globosEstallados++;

            if (globosEstallados == 6) {
                System.out.println("Feliz cumple! esta es la sorpresa");
            }
        }

        System.out.println("todos los globos han sido estallados");






*/

        /*FOR / FOR EACH
        Hay una lista de invitados y queremos darle las gracias por asistir a cada uno
        de ellos con un mensaje personalizado.*/

        String[] invitados = {"Juan","Maria","Pedro"};

        //  for(int i=0; i< invitados.length;i++){
        //    System.out.println("Gracias por asistir, " + invitados[i] + " !");
        // }

        for(String invitado : invitados){
            System.out.println("gracias por asistir (probando for each) " + invitado + " !");
        }





    }
}