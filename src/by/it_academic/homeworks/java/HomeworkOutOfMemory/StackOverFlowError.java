package by.it_academic.homeworks.java.HomeworkOutOfMemory;

public class StackOverFlowError {
    public static void main(String[] args) {

        System.out.println("java.lang.StackOverflowError.");

        jlsofeRecursiveMetods();
    }

    private static void jlsofeRecursiveMetods() {
        jlsofeRecursiveMetods();
    }
}

