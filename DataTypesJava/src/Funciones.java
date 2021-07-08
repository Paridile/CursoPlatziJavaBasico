public class Funciones {
    public static void main(String[] args) {
        double y = 5;
        //Area de circulo
        System.out.println(circleArea(y));
        System.out.println(sphereArea(y));
        System.out.println(sphereVolume(y));
        System.out.println("$200 MXN a dolares " +  convertToDolar(200,"MXN"));
        System.out.println("$200 COP a dolares " +  convertToDolar(200,"COP"));
    }

    public static double circleArea(double radio) {
        return Math.PI * Math.pow(radio,2);
    }
    public static double sphereArea(double radio) {
        return 4 * Math.PI * Math.pow(radio,2);
    }
    public static double sphereVolume(double radio) {
        return (4/3) * Math.PI * Math.pow(radio,3);
    }
    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moned, solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     *
     * */
    public static double convertToDolar(double quantity, String currency) {
        //MXN COP
        switch (currency) {
            case "MXN":
                quantity *= 0.05009063;
                break;
            case "COP":
                quantity *= 0.00026038136;
                break;
            default:
                System.out.println("opcion no valida");
        }
        return quantity;
    }
}
