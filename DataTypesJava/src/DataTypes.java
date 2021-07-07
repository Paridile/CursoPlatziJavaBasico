public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 123456789024323454L;

        double nD = 123.4567890456;
        float nF = 123.456F;

        var salary = 1000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Pablo Rios";
        System.out.println("Employee: " + employeeName + " salary: " + totalSalary);
    }
}
