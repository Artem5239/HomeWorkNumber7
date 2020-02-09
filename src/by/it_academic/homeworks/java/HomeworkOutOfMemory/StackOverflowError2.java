package by.it_academic.homeworks.java.HomeworkOutOfMemory;

public class StackOverflowError2 {

           public static void main(String[] args) {

            System.out.println("java.lang.StackOverflowError2.");

            new StackOverflowError2().soeNoRecursive();

        }

        private void soeNoRecursive() {
            new StackOverflowError2().soeNoRecursive();
        }
}
