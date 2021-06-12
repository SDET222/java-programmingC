package day52_inheritance;

public class Discord extends MobileApp{


    public void chat(String someone) {

        System.out.println("Chatting with "+ someone + " on Discord");


    }

    @Override

    public void useTheApp(int minutes) {
        super.useTheApp(17);
        chat("Murodil");
    }

    @Override

    public boolean download() {

        System.out.println("Downloading Discord 0.0.23 from App Store");
        return true;
    }

            public void printInfo() {

                System.out.println("App Name = " + getName());

                System.out.println("App version = " + getVersion());

            }

}
