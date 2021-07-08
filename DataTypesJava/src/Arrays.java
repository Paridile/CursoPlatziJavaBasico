public class Arrays {
    public static void main(String[] args) {
        String[] androidVersion = new String[17];
        String days[] = new String[7];
        String[][] cities = new String[4][2];
        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];
        androidVersion[0] = "Apple pie";
        androidVersion[1] = "Banana bread";
        androidVersion[2] = "Cupcake";
        androidVersion[3] = "Donut";

        System.out.println(androidVersion[0]);
        System.out.println(androidVersion[1]);
        System.out.println(androidVersion[2]);
        System.out.println(androidVersion[3]);

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

        String [][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);


    }
}
