package day59_polymorphism_exeptions;

public class WebElementUtil {

    public static void clickElement(WebElement element) {

        System.out.println("Clicking on element");
        element.click();
        element.getText();
    }

    public static WebElement getLink(String txt) {
        System.out.println("Searching for a link with txt = " + txt);
        return new Link();
    }

}
