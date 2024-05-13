public class Profesor extends Persona{
    private String materia;
    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia=materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("El nombre del profesor es : " +  getNombre() + " esta enseñando " + materia);

    }


}
