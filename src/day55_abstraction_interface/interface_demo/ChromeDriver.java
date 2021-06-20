package day55_abstraction_interface.interface_demo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ChromeDriver implements WebDriver{



    @Override
    public void get(String url) {
        System.out.println("ChromeDriver navigating to "+url); ;
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver quit session");
    }

    @Override
    public String getTitle() {
        return "CHROME";
    }



}
