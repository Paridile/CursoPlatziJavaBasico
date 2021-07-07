public class MathematicalOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        System.out.println(Math.E);
        //Devuelve un entero hacia abajo
        System.out.println(Math.ceil(x));
        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));
        //potencia
        System.out.println(Math.pow(x,y));
        //Numero mayor
        System.out.println(Math.max(x,y));
        //Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de circulo
        System.out.println(Math.PI * Math.pow(y,2));

        //Area de esfera
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //volumen de esfera
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
        
    }
}
