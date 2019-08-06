public class MethodsExercise {

    //Declare a basic method to print hello world
    public static void printHello() {
        System.out.println("Hello, World");
        System.out.println("And welcome!");
    }

    //Return square integer value
    public static int squareValue(int num) {
        int retValue;
        retValue = num * num;
        return retValue;
    }

    //Determine if first number higher than second
    public static Boolean isNumHigher(int num1, int num2) {
        return (num1 > num2);
    }

    //Print number value
    public static void printNumber(int num) {
        System.out.println("Squared number is: " + num);
    }

    //Add two integers
    public static int add (int int1, int int2) {
        int answer = int1 + int2;
        return answer;
    }

    //Add three integers
    public static int add (int int1, int int2, int int3) {
        int answer = add(int1, int2);
        answer = add(answer, int3);
        return answer;
    }

    //Add two doubles
    public static double add (double dec1, double dec2) {
        double answer = dec1 + dec2;
        dec1 = dec1 * 10.0;
        return answer;
    }

    public static void main(String[] args) {
        printHello();
        printHello();
        printHello();

        int answer = squareValue(2);
        printNumber(answer);

        answer = squareValue(3);
        printNumber(answer);

        System.out.println(isNumHigher(4,3));

        int num1 = 4, num2 = 7, num3 = 9;
        double dec1 = 2.3, dec2 = 4.3;

        System.out.println("Adding 2 integers: " + add(num1, num2));
        System.out.println("Adding 2 doubles: " + add(dec1, dec2));
        System.out.println("Adding 2 doubles: " + add(dec1, dec2));

        System.out.println("Value of dec1 " + dec1);
    }
}
