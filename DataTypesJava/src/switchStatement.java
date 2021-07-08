public class switchStatement {
    public static void main(String[] args) {
        String comorModeSelected = "Light";
        switch(comorModeSelected) {
            case "Light":
                System.out.println("Seleccionaste light mode");
            break;
            case "Night":
                System.out.println("Seleccionaste Night mode");
            break;
            case "Dark":
                System.out.println("Seleccionaste Dark mode");
            break;
            case "Dark blue":
                System.out.println("Seleccionaste Dark blue mode");
            break;
            default:
                System.out.println("Selecciona una opcion");
            break;
        }
    }
}
