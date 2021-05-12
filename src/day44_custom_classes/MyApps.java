package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {

        App googleMaps = new App();
        googleMaps.name = "Google Maps";
        googleMaps.usage = "displays maps";
        googleMaps.version = 5.7;

        googleMaps.update();
    }
}
