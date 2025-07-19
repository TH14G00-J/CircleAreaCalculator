import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        char answer;

        do {
            System.out.print("Enter the radius of the circle: ");
            radius = sc.nextDouble();
            System.out.printf("Area = %.4f\n", Math.PI * radius * radius);
            System.out.println("Do you want to calculate another area? [y/n]");
            answer = sc.next().toUpperCase().charAt(0);
        } while (answer == 'Y');
        sc.close();
        System.out.println("Program terminated.");
    }
}