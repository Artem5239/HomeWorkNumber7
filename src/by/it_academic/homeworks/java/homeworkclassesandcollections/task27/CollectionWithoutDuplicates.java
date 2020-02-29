package by.it_academic.homeworks.java.homeworkclassesandcollections.task27;

import java.util.ArrayList;

public class CollectionWithoutDuplicates {
    public static void main(String[] args) {
        int number = 30;
         ArrayList<Integer> list = new ArrayList<Integer>(number);

        for (int i = 0; i < number; i++) {
            int a = (int) (Math.random() * 10 + 1);
            list.add(a);
        }
        System.out.println("Duplicates List "+ list);
      Object[] st = list.toArray();
      for (Object i : st) {
        if (list.indexOf(i) != list.lastIndexOf(i)) {
            list.remove(list.lastIndexOf(i));
        }
    }

    System.out.println("Distinct List "+list);
    }
}
