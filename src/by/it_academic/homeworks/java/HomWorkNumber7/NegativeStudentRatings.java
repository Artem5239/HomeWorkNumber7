package by.it_academic.homeworks.java.HomWorkNumber7;

import java.util.ArrayList;

public class NegativeStudentRatings {
    public static void main(String[] args) {
        int numberofstudents = 25;
        int negative = 2;
        ArrayList<Integer> marks = new ArrayList<Integer>(numberofstudents);

        for (int i = 0; i < numberofstudents; i++) {
            int a = (int) (Math.random() * 10 + 1);
            marks.add(a);
        }
        System.out.println(marks);

        ArrayList<Integer> negativeList = new ArrayList<Integer>();
        for (int i = 0; i < numberofstudents; i++) {
            int assessments = marks.get(i);
            if (assessments <= negative) {
                negativeList.add(assessments);
            }
        }
        marks.removeAll(negativeList);
        System.out.println(marks);
    }
}






