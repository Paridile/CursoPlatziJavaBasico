public class Arrays {
    public static void main(String[] args) {
        String[] androidVersion = new String[4];
        String days[] = new String[7];
        String[][] cities = new String[4][2];
        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];
        androidVersion[0] = "Apple pie";
        androidVersion[1] = "Banana bread";
        androidVersion[2] = "Cupcake";
        androidVersion[3] = "Donut";

        for (int i = 0; i < androidVersion.length; i++) {
            System.out.println(androidVersion[i]);
        }

        System.out.println();

        for (String version:androidVersion) {
            System.out.println(version);
        }

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        for (int i = 0; i < cities.length ; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }
        System.out.println();

        for (String[] city:cities) {
            for (String c: city) {
                System.out.println(c);
            }
        }

        System.out.println();

        String [][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                for (int k = 0; k < animals[i][j].length; k++) {
                    for (int l = 0; l < animals[i][j][k].length; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
        System.out.println();
        System.out.println();

        for (String[][][] i:animals) {
            for (String [][] j: i) {
                for (String[] k: j) {
                    for (String l: k) {
                        System.out.println(l);
                    }
                }
            }
        }


    }
}
