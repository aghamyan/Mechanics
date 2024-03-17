import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter M1:");
        double M1 = scanner.nextDouble();
        System.out.println("Enter M2:");
        double M2 = scanner.nextDouble();
        System.out.println("Enter M3:");
        double M3 = scanner.nextDouble();
        System.out.println("Enter  friction m1:");
        double mu1 = scanner.nextDouble();
        System.out.println("Enter friction m2:");
        double mu2 = scanner.nextDouble();
        System.out.println("Enter friction m3:");
        double mu3 = scanner.nextDouble();
        System.out.println("Enter L:");
        double L = scanner.nextDouble();


        double gravity = 9.8;
        double a1 = (M2 * gravity - mu1 * M1 * gravity) / M1;
        double a2 = (mu1 * M1 * gravity - mu2 * M2 * gravity) / M2;
        double a3 = (mu2 * M2 * gravity - mu3 * M3 * gravity) / M3;
        double D = 0.5 * a1 * Math.pow(L, 2) / gravity;


        System.out.println("Acceleration  M1 = " + a1 + " m/s^2");
        System.out.println("Acceleration  M2 =  " + a2 + " m/s^2");
        System.out.println("Acceleration M3 =  " + a3 + " m/s^2");
        System.out.println("Max distance M1 is " + D + " meters");



    }
}