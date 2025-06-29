public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public static int add(int a, int b) {
        System.out.println("Sum: " + (a + b));
        return a + b;
    }

    /**
     * @param a the first number
     * @param b the second number
     * @return the difference between a and b
     */
    public static int subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
        return a - b;
    }

    /**
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public static int multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
        return a * b;
    }

    /**
     * @param a the first number
     * @param b the second number
     * @return the division of a by b
     */
    public static int divide(int a, int b) {
        System.out.println("Quotient: " + (a / b));
        return a / b;
    }
}
