package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result = first > second ? 10 : -10;
        System.out.println(result);
    }

    public static void main(String[] args) {
        TernaryAssignment ta = new TernaryAssignment();
        ta.assignAndPrintBasedOnWhichBigger(10, 19);
    }

    //Create a variable "int result" and dependent on the result comparison of 2 variables from method arguments and the assign to the created variable the value using ternary result: if the first is bigger -> 10 otherwise -10.
    //And print result variable.
}
