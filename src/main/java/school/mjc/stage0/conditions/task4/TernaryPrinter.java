package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        int result = 0;
        result = first > second ? first : second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        TernaryPrinter tp = new TernaryPrinter();
        tp.printWhichIsBigger(1, 1);
    }

    //Implement the program that will consume 2 numbers and based on their comparison will print to console which is bigger.
    //Comparison should be implemented with ternary operator, which should be used inside of System.out.println method.(print "first", if the first is bigger and "second" in the rest cases).
    //System.out.println should be used only 1 time
}
