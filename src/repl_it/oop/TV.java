package repl_it.oop;

public class TV {

    //int channel=1, int volumeLevel=0, boolean on = false, String brand = "undefined"

    int channel=1;
    int volumeLevel=0;
    boolean on = false;
    String brand = "undefined";

    public TV() {

        System.out.println("Creating TV object using no args-constructor");
    }

    public TV(String brand) {

        System.out.println("Creating TV object using 1 arg - constructor");

        this.brand = brand;

    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {

        if (isOn()==true&&channel>0&&channel<=120) {

            this.channel = channel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }

    }

    public int getVolumeLevel() {
        return this.volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {

            if (isOn()==true && volumeLevel>=0 && volumeLevel <7) {
                this.volumeLevel = volumeLevel;
            } else {
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
            }


    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp() {

        channel+=1;

    }

    public void channelDown() {

        channel-=1;
    }

    public void volumeUp() {

        volumeLevel+=1;
    }

    public void volumeDown() {

        volumeLevel-=1;
    }

    public boolean isOn() {

        this.on=on;
        if(on){
            return true;
        } else {
            return false;
        }

    }

        public void turnOn() {

        if(on) {
            System.out.println("TV is already ON");
        } else {
            on=true;
        }

        }

    public void turnOff() {
        if(!on) {
            System.out.println("TV is already OFF");
        } else {
            on=false;
        }

    }










}
