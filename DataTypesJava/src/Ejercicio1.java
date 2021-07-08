public class Ejercicio1 {
    public static void main(String[] args) {
        Familiar papa = new Familiar("Pablo","Rios",62,1.80F,"papá");
        Familiar mama = new Familiar("Hilda","Diaz",58,1.64F,"mamá");
        Familiar hermana = new Familiar("Itzel","Rios",25,1.69F,"hermana");
        System.out.println(papa.presentarse());
        System.out.println(mama.presentarse());
        System.out.println(hermana.presentarse());
    }
}
