public class Estudiante extends Persona {
    private String curso;


    public Estudiante(String nombre, int edad,String curso) {
        super(nombre, edad);
        this.curso=curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("El nombre del estudiante es : " +  getNombre() + " esta realizando el curso de  " + curso);


    }
}