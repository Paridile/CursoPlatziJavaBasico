public class ForLoop {

    static boolean isTurnedOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        for (int i=0 ; i<10 ; i++) {
            printSOS();
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
