package repl_it.oop;

public class ParkingMeter {

    int timeLeft;
    int maxTime=0;


    public ParkingMeter(int maxTime) {


        this.maxTime = maxTime;

    }

    /**
     * If the value of the parameter is equal to 25, the value of timeLeft is
     * increased by 30; otherwise no increase is performed. Furthermore, the
     * increase occurs only if the value of timeLeft will not exceed the value of
     * maxTime. add returns a boolean value: true if timeLeft was increase, false
     * otherwise.
     */

    public boolean add(int time) {

        if(time==25&&(timeLeft<maxTime)){
            timeLeft+=30;
            return true;
        }

        return false;
    }

    //A method named tick() that accepts no parameters and returns no value.
    // tick() decreases the value of timeLeft by 1, but only if the value of
    // timeLeft is greater than 0.

        public void tick() {

        if(timeLeft>0) {
            timeLeft--;
        }

        }

        //A method named isExpired() that accepts no parameters.
    // isExpired returns a boolean value: true if the value of timeLeft is
    // equal to 0; false otherwise.

        public boolean isExpired() {
        if(timeLeft==0){
            return true;
        }

        return false;
        }








}
