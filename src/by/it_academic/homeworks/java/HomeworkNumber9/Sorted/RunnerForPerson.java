package by.it_academic.homeworks.java.HomeworkNumber9.Sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerForPerson {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>() {{
            add(new Person("Ben", 231));
            add(new Person("Grimm", 105));
            add(new Person("Kolya", 31));
            add(new Person("Artem", 26));
            add(new Person("Vano", 18));
        }};
        System.out.println(personList);

        System.out.println("sort by name");
        Collections.sort(personList, SortedClass.SORT_BY_NAME);
        System.out.println(personList);

        System.out.println("sort by age");
        Collections.sort(personList, SortedClass.SORT_BY_AGE);
        System.out.println(personList);
    }}



