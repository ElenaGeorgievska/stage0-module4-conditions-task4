package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first > second) {
            System.out.println(first);
        } else if (first > third) {
            System.out.println(first);
        } else if (second > third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }

    public static void main(String[] args) {
        MaxNumberPrinter mnp = new MaxNumberPrinter();
        mnp.printGreatest(1, 2, 3);
    }

    //Implement the program that will consume 3 numbers from method arguments
    //and it will print the print greatest out of three. In case if there are more than 1 biggest -> print any of them.(Libraries are forbidden)
}
