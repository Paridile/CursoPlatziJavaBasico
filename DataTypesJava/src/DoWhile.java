import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int response = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Selecciona el numero de la opcion de deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 1:
                    System.out.println("movies");
                    break;

                case 2:
                    System.out.println("Series");
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(response != 0);

    }
}
