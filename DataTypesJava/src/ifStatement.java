public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoohEnabled = true;
        int fileSended = 3;
        if(isBluetoohEnabled) {
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            fileSended--;
            System.out.println("Por favor enciende tu bluetooth para iniciar la transferencia");
        }
        System.out.println(isBluetoohEnabled);
        System.out.println(fileSended);
    }
}
