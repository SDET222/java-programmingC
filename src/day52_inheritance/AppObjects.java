package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {

       MobileApp mobApp = new MobileApp();
        mobApp.setName("YuTube");
       mobApp.useTheApp(10);

        System.out.println("============================");
       Instagram insta = new Instagram();
        insta.setName("Instagram");
        insta.setVersion(5.3);
       insta.useTheApp(20);

        System.out.println("============================");

       Discord dsc = new Discord();
       dsc.setName("Discord");
       dsc.setVersion(0.7);
        System.out.println("Discord version: " + dsc.getVersion());


       dsc.useTheApp(17);

        System.out.println("============================");
        dsc.download();
        insta.download();
        System.out.println("============================");
        dsc.printInfo();
























    }
}
