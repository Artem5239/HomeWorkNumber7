package by.it_academic.homeworks.java.HomeworkOutOfMemory;

public class OutOfMemory2 {

        public static void main(String[] args) {

            System.out.println("java.lang.OutOfMemoryError.");

            oomeBigObject();
        }

        private static void oomeBigObject() {
            String string = "String";
            while (true) {
                string += string;
            }
        }
    }

