public class Main {
    public static void main(String[] args) {
        Persona persona1=new Persona("Jose",30);
        Estudiante estudiante1= new Estudiante("Juan",20,"Veterinaria");
        Profesor profesor1=new Profesor("Maria",45,"Biologia");


        estudiante1.mostrarInformacion();
        profesor1.mostrarInformacion();


    }
}