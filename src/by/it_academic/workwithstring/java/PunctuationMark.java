package by.it_academic.workwithstring.java;

public class PunctuationMark {
           public static void main(String[] args) {
            String text = "Charles Dickens, a very popular English writer and the author of 'David Copperfield', 'Oliver Twist', 'Dombey and Son' and other books, spent a lot of time in the British Museum Library.";
            int Mark = 0;
            if (text.length() != 0) {
                Mark++;
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == ',' || text.charAt(i) == '.') {
                        Mark++;
                    }
                }
            }

            System.out.println("In text " + Mark + " punctuation marks");
        }
    }

