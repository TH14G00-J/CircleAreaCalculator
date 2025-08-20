import entities.CircleAreaCalculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircleAreaCalculator calculateArea = new CircleAreaCalculator();

        char answer;
        do {
            System.out.print("Enter the radius of the circle: ");
            double radius = sc.nextDouble();
            System.out.printf("Area = %.4f\n", calculateArea.calculateCircleArea(radius));
            System.out.println("Do you want to calculate another area? [y/n]");

            while (true) {
                String input = sc.next().trim().toUpperCase();
                if (input.isEmpty()) {
                    continue;
                }
                answer = input.charAt(0);
                if (calculateArea.isValidAnswer(answer)) {
                    break;
                }
                System.out.println("Invalid answer, please enter Y or N.");
            }
        } while (answer == 'Y');
        System.out.println("Program terminated.");
        sc.close();
    }
}
