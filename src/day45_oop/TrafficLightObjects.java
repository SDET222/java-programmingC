package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {



        TrafficLight light1 = new TrafficLight();

        //light1.color = "green";

        light1.changeColor("green");
        light1.showColor();

        light1.changeColor("red");
        light1.showColor();

        TrafficLight light2 = new TrafficLight();

        System.out.println("========Light2========");

        light2.changeColor("yellow");
        light2.showColor();

        light2.changeColor("purple");
        light2.showColor();




    }
}
