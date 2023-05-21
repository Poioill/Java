package Course_pracrise;

import java.util.Scanner;

public class MathFiches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, z;

        System.out.print("Enter the x side: ");
        x = scanner.nextDouble();
        System.out.print("Enter the y side: ");
        y = scanner.nextDouble();

        z = Math.sqrt(x * x + y * y);

        System.out.println("Hypotenuse equals " + z);

    }
}
