package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int result = 0;
        result = first > second ? first : second;
        System.out.println(result);
    }

    public static void main(String[]args){
        TernaryGreatestNumberPrinter tgnp = new TernaryGreatestNumberPrinter();
        tgnp.printGreatest(12, -400);
    }

    //Rewrite Greatest number printer task from module 4.1 Task # 2 using rewrite some task with ternary operator:
    //Implement the program that will find the greatest number from two that are passed as parameters to the method and print the greatest.
    //In case of equality print any of them. Implement program in the code snippet:
}
