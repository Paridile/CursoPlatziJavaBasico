public class Familiar extends Persona{
    private String parentesco;
    public Familiar(String nombre,String apellido,int edad,float estatura,String parentesco) {
        super(nombre, apellido, edad, estatura);
        this.parentesco=parentesco;
    }

    @Override
    public String presentarse() {
        return super.presentarse() + " y soy " + parentesco + " de pablo";
    }
}
