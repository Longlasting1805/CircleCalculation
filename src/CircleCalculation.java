import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        System.out.printf("diameter %d%n", 2 * radius);
        System.out.printf("circumference %.5f%n", 2 * 3.14159 * radius);
        System.out.printf("area %.5f%n",  3.14159 * radius * radius);





    }
}
