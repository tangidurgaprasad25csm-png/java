package Assignment;

public class IgnoreCase {
    public static void main(String[] args) {
        String userInput = "HELLO";
        String correctWord = "hello";

        System.out.println("Equal ignoring case: " 
        + userInput.equalsIgnoreCase(correctWord));
    }
}
