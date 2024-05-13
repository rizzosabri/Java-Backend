public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Juan", 20, "Veterinaria");
        Profesor profesor1 = new Profesor("Maria", 45, "Biologia");
        estudiante1.mostrarInformacion();
        System.out.println("el estudiante esta : ");
        estudiante1.realizarActividad();
        profesor1.mostrarInformacion();
        System.out.println("el profesor esta : ");
        profesor1.realizarActividad();

    }
}