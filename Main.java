//Hello World
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World");
//     }
// }

//Create a function isDivisible(n, x, y) that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero digits.
public class Main {
    public static Boolean main(long n, long x, long y) {
        return (n % x == 0) && (n % y == 0);
    }
}