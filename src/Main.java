import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double springMaintenanceCost;
        double summerMaintenanceCost;
        double fallMaintenanceCost;
        double winterMaintenanceCost;
        double totalMaintenanceCost;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the cost of maintenance during spring.");
        springMaintenanceCost = scan.nextDouble();
        System.out.println("Enter the cost of maintenance during summer.");
        summerMaintenanceCost = scan.nextDouble();
        System.out.println("Enter the cost of maintenance during fall.");
        fallMaintenanceCost = scan.nextDouble();
        System.out.println("Enter the cost of maintenance during winter.");
        winterMaintenanceCost = scan.nextDouble();

        totalMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;
        System.out.println("The total cost of yearly maintenance is $" + totalMaintenanceCost + ".");
    }
}