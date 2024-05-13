public class Profesor extends Persona{
    public String materia;

    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    @Override
    public void realizarActividad() {
        System.out.println(" enseñando.......");

    }

    @Override
    public void mostrarInformacion() {
        System.out.println("el nombre del profesor es: " + nombre + " tiene: " +
                edad + " años y esta a cargo de la materia: " + materia);

    }
}
