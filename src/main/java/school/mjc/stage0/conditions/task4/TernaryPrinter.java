package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {

        boolean condition = (second >= first);

        System.out.println(condition ? "second" : "first");

    }

    public static void main(String[] args) {
        TernaryPrinter tp = new TernaryPrinter();
        tp.printWhichIsBigger(1, 9);
    }

}
