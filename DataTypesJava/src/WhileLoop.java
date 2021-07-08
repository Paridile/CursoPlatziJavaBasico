public class WhileLoop {

    static boolean isTurnedOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        int i = 0;
        while (isTurnedOnLight && i<10) {
            printSOS();
            i++;
        }
    }
    public static void printSOS() {
        System.out.println(". . . - - - . . .");
    }
    public static boolean turnOnOffLight() {
        //isTurnedOnLight = !isTurnedOnLight;
        isTurnedOnLight = isTurnedOnLight ? false : true;
        return isTurnedOnLight;
    }
}
