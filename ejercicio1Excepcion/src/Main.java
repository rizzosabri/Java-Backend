import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int[] numeros={10,40,60,80};

        System.out.println("ingresa un numero entero: ");
        int indice= scanner.nextInt();

        try{int numero=numeros[indice];
        System.out.println("el numero en el indice elegido es: "+ numero);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" ERROR: EL INDICE ESTA FUERA DEL RANGO DEL ARREGLO");
        }finally {
            System.out.println("vamos a hacer lo q dice aqui si o si");
        }

    }
}