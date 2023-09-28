import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        double width, height;

        final double MIN_VALUE = 0, MAX_VALUE = 100;
        do {

            System.out.print("Enter the width of the rectangle: ");
            width = input.nextDouble();
            if (width <= MIN_VALUE || width > MAX_VALUE) {
                System.out.println("Invalid input. Please enter a positive number less than or equal to " + MAX_VALUE + ".");
            }
        } while (width <= MIN_VALUE || width > MAX_VALUE);

        do {
            System.out.print("Enter the height of the rectangle: ");
            height = input.nextDouble();
            if (height <= MIN_VALUE || height > MAX_VALUE) {
                System.out.println("Invalid input. Please enter a positive number less than or equal to " + MAX_VALUE + ".");
            }
        } while (height <= MIN_VALUE || height > MAX_VALUE);
        input.close();
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        // Print the results
        System.out.printf("The area of the rectangle is %.2f.\n", area);
        System.out.printf("The perimeter of the rectangle is %.2f.\n", perimeter);
        System.out.printf("The length of the diagonal of the rectangle is %.2f.\n", diagonal);
    }
}