package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = 0;
        result = first > second ? first : second;
        result = first > third ? first : third;
        result = second > third ? second : third;

        System.out.println(result);
    }

}
