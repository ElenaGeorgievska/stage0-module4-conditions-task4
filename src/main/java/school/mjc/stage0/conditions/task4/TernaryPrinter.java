package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        String result = "0";
        result = (first > second) ? "first" : "second";

        result = (second > first) ? "second" : "first";

        result = (first == second) ? "second" : "first";
        System.out.println(result);

    }

    public static void main(String[] args) {
        TernaryPrinter tp = new TernaryPrinter();
        tp.printWhichIsBigger(1, 9);
    }

}
