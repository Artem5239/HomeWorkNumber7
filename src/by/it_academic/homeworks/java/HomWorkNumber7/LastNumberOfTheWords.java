package by.it_academic.homeworks.java.HomWorkNumber7;

public class LastNumberOfTheWords {
    public static void main(String[] args) {
        String text = "London is the capital of great Britain";
        char firstWord = text.charAt(5);
        char secondWord = text.charAt(8);
        char thirdWord = text.charAt(12);
        char fourthWord = text.charAt(20);
        char fifthWord = text.charAt(23);
        char sixthWord = text.charAt(28);
        char seventhWord = text.charAt(36);
        System.out.println("Received word-" + firstWord + secondWord + thirdWord + fifthWord + fourthWord + sixthWord + seventhWord);

    }
}
