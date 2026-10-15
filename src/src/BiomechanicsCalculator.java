import java.util.Scanner;

public class BiomechanicsCalculator {

    // Stress = Force / Area
    public static double calculateStress(double force, double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Area must be positive.");
        }
        return force / area;
    }

    // Strain = Change in Length / Original Length
    public static double calculateStrain(double change, double original) {
        if (original <= 0) {
            throw new IllegalArgumentException(
                "Original length must be positive."
            );
        }
        return change / original;
    }

    // Young's Modulus = Stress / Strain
    public static double calculateModulus(double stress, double strain) {
        if (strain == 0) {
            throw new IllegalArgumentException("Strain cannot be zero.");
        }
        return stress / strain;
    }

    // Force = Stress * Area
    public static double calculateForce(double stress, double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Area must be positive.");
        }
        return stress * area;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        System.out.println("================================");
        System.out.println("     BIOMECHANICS CALCULATOR");
        System.out.println("================================");

        while (choice != 0) {

            System.out.println("\n1. Calculate Stress");
            System.out.println("2. Calculate Strain");
            System.out.println("3. Calculate Young's Modulus");
            System.out.println("4. Calculate Force");
            System.out.println("5. Convert Pressure");
            System.out.println("0. Exit");
            System.out.print("\nEnter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid menu number.");
                scanner.nextLine();
                continue;
            }

            choice = scanner.nextInt();

            try {
                double result;

                switch (choice) {

                    case 1:
                        System.out.print("Force (N): ");
                        double force = scanner.nextDouble();

                        System.out.print("Area (m^2): ");
                        double area = scanner.nextDouble();

                        result = calculateStress(force, area);

                        System.out.printf("Stress = %.4f Pa%n", result);
                        break;

                    case 2:
                        System.out.print("Change in length (m): ");
                        double change = scanner.nextDouble();

                        System.out.print("Original length (m): ");
                        double original = scanner.nextDouble();

                        result = calculateStrain(change, original);

                        System.out.printf("Strain = %.6f%n", result);
                        break;

                    case 3:
                        System.out.print("Stress (Pa): ");
                        double stress = scanner.nextDouble();

                        System.out.print("Strain: ");
                        double strain = scanner.nextDouble();

                        result = calculateModulus(stress, strain);

                        System.out.printf(
                            "Young's Modulus = %.4f Pa%n", result
                        );
                        break;

                    case 4:
                        System.out.print("Stress (Pa): ");
                        double appliedStress = scanner.nextDouble();

                        System.out.print("Area (m^2): ");
                        double crossArea = scanner.nextDouble();

                        result = calculateForce(appliedStress, crossArea);

                        System.out.printf("Force = %.4f N%n", result);
                        break;

                    case 5:
                        System.out.print("Pressure (Pa): ");
                        double pressure = scanner.nextDouble();

                        System.out.printf(
                            "Kilopascals = %.4f kPa%n",
                            pressure / 1000.0
                        );

                        System.out.printf(
                            "Megapascals = %.6f MPa%n",
                            pressure / 1000000.0
                        );
                        break;

                    case 0:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid menu choice.");
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
