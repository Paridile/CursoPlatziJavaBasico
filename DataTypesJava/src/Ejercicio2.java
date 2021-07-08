public class Ejercicio2 {

    public static void main(String[] args) {
        //char c = ‘z’; conviertelo a int
        char c = 'z';
        int cI = c;
        System.out.println(cI);

        //int i = 250; conviertelo a long y luego de long a short
        int i = 250;
        long iL = i;
        System.out.println(iL);
        short iS = (short)iL;
        System.out.println(iL);

        //double d = 301.067; conviertelo a long
        double d = 301.067;
        long dL = (long) d;

        //int i = 100; súmale 5000.66 y conviertelo a float
        int i2 = 100;
        float i2F = (float)i2 + 5000.66F;
        System.out.println(i2F);

        //int i = 737; multiplícalo por 100 y conviertelo a byte
        int i3 = 737;
        byte i3B= (byte) ((byte) i3 * 100);
        System.out.println(i3B);

        //double d = 298.638; divídelo entre 25 y conviertelo a long
        double d2 = 298.638/25;
        long d2L = (long) d2 ;
        System.out.println(d2L);


        // Ejercicio 3
        /*
            Explica cómo distribuirías y crearías un ambiente de
            producción para un programa compilado con la versión
            9 de Java.Incluye al menos dos Sistemas Operativos.
        */

        /*
            Al compilar un proyecto en formato .jar este podrá
            correr en cualquier sistema operativo que tenga instalada
            la version 9 de java (o posterior)
         */

    }

}
