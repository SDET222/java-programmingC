package day45_oop;

public class TrafficLight {

    String color;

    void showColor() {

            System.out.println("current color: " + color);

        }


        void changeColor (String newColor) {
        if(newColor.equals("green")||newColor.equals("red")||newColor.equals("yellow")) {

            System.out.println("changing color to " + newColor);
            color=newColor;
        } else {
            System.out.println(newColor+ " in Invalid color!");
        }

        }




    }



