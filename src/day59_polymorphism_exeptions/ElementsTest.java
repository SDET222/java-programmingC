package day59_polymorphism_exeptions;

public class ElementsTest {
    public static void main(String[] args) {

      Link link = new Link();
      link.click();
        System.out.println(link.getText());
      link.getLinkHref();
      link.sendKeys("HEY!");
      WebElement input = new InputField();

      WebElement loginLink = new Link();
        loginLink.sendKeys("no");
        System.out.println(loginLink.getText());

        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(input);

        WebElement login = WebElementUtil.getLink("login");
        login.click();







    }
}
