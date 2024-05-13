public class Estudiante extends Persona{
    private String curso;

    public Estudiante(String nombre, int edad, String curso){
        super(nombre,edad);
        this.curso=curso;
    }

    @Override
    public void realizarActividad() {
        System.out.println(" estudiando .....");

    }

    @Override
    public void mostrarInformacion() {
        System.out.println("el nombre del estudiante es: " + nombre + " tiene: " +
                edad + " años y esta haciendo el curso de: " + curso);

    }
}
