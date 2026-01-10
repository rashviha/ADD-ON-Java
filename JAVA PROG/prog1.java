public class prog1 {
    public static void main(String[] args) {

        int a = 3, b = 7;
        System.out.printf("Sum of %d and %d is %d%n", a, b, a+ b);
        System.out.println("Difference of " + a + " and " + b + " is " + sub(a,b));
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}