package mooc;


public class StarSign {

/**Define a method called printStars that prints the given number of stars a
 * Define a method called printSquare(int size) that prints a suitable square with the help of the printStars method.
 * Write a method called printRectangle(int width, int height) that prints the correct rectangl
 * Create a method called printTriangle(int size) that prints a triangle */


    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        printStars(size);
        printStars(size);
        for (int i = 1; i <= size; i++) {
            System.out.print("*");
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise

        for (int i = 1; i <= height; i++) {
            System.out.print("*");
            for (int j = 1; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int i = 1; i <= size; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
        }
    }
}
