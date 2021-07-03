package day59_polymorphism_exeptions;

public class InputField implements WebElement {

    public static final String TAG_NAME = "input";

    public String getValue() {
        System.out.println("InputField VALUE");
        return "Selenium";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("typing into input field - " +txt);
    }

    @Override
    public void click() {
        System.out.println("clicking on input field");
    }

    @Override
    public String getText() {

        return "No text";
    }
}
