public class Casting {
    public static void main(String[] args) {
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);
        //Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double)30/12);
        
    }
}
