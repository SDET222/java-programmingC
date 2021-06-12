package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {

       MobileApp mobApp = new MobileApp();
        mobApp.name = "YuTube";
       mobApp.useTheApp(10);

        System.out.println("============================");
       Instagram insta = new Instagram();
        insta.name = "Instagram";
       insta.useTheApp(20);

        System.out.println("============================");

       Discord dsc = new Discord();
       dsc.name = "Discord";

       dsc.useTheApp(17);




















    }
}
