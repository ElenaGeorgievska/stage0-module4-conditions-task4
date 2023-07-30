package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = 0;
        result = first > second ? first : second;
        result = first > third ? first : third;
        result = second > third ? second : third;

        System.out.println(result);
    }

    //Implement the program that will consume 3 numbers from method arguments
    //and it will print the print greatest out of three.
    //In case if there are more than 1 biggest -> print any of them.(Libraries are forbidden)
}
