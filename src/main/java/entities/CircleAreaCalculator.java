package entities;

public class CircleAreaCalculator {

    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public boolean isValidAnswer(Character answer) {
        return answer == 'Y' || answer == 'N';
    }
}
