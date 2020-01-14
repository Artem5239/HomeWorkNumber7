package by.it_academic.workwithstring.java;

public class NumberOfWords {
    public static void main(String[] args) {
        String text = "The British Museum has one of the largest libraries in the world.";
        int gap = 0;
        if (text.length() != 0) {
            gap++;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    gap++;
                }
            }
        }

        System.out.println("In text " + gap + " words");
    }
}

