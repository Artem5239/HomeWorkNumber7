package by.it_academic.homeworks.java.HomeworkNumber9.Sorted;

import java.util.Comparator;

public class SortedClass {
    public static Comparator<Person> SORT_BY_NAME = new Comparator<Person>() {

        @Override
        public int compare(Person w1, Person w2) {
            return w1.getName().compareTo(w2.getName());
        }
    };

    public static Comparator<Person> SORT_BY_AGE = new Comparator<Person>() {
        @Override
        public int compare(Person w1, Person w2) {
            return w1.getAge() - w2.getAge();
        }
    };

}
