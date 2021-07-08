public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private float estatura;

    public Persona(String nombre, String apellido, int edad, float estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String presentarse() {
        return "Hola, soy " + nombre + " " + apellido + ", tengo " + edad + " años y mido " + estatura + "m" ;
    }
}
