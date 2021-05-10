package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("===Starting Etsy Search Smoke Test===");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResulsAreDisplayed();


    }

    public static void openBrowser() {

        System.out.println("Open google chrome");
    }

    public static void navigateToEtsyUrl() {

        System.out.println("Navigate to www.etsy.com");
    }

    public static void searchForWoodenSpoon() {

        System.out.println("Search for Wooden Spoon");
    }

    public static void verifyResulsAreDisplayed() {

        System.out.println("All results for wooden spoon are displayed");
    }

}
