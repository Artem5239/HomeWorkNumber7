package by.it_academic.workwithstring.java;

public class additionsOfWordsWithAppend {
    public static void main(String[] args) {
    StringBuffer additionsOfWords = new StringBuffer("One");
        for (int i = 0; i < 1000; i++) {
        additionsOfWords.append(" punch");
    }
        System.out.println(additionsOfWords);
}
}

