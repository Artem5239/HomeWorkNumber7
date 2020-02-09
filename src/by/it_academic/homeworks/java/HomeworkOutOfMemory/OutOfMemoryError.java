package by.it_academic.homeworks.java.HomeworkOutOfMemory;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {

        public static void main(String[] args) {
            System.out.println("java.lang.OutOfMemoryError.");

            oomeofArraylist();
        }

        private static void oomeofArraylist() {
            List<String> strings = new ArrayList<String>();
            while (true) {
                strings.add(".1.") ;
            }
        }
    }

