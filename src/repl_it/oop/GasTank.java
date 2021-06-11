package repl_it.oop;

public class GasTank {

    double ammount;
    double capaciy;

    public GasTank(double capacity) {

        this.capaciy=capacity;

    }

    /**
     * addGas() that accepts a parameter of type double.
     * The value of the amount instance variable is increased by
     * the value of the parameter. However, if the value of amount
     * is increased beyond the value of capacity, amount is set to capacity
     */


        public void addGas(double gal) {

        ammount+=gal;

        if(ammount>capaciy) {
            ammount=capaciy;
        }

        }

    /**
     * useGas() that accepts a parameter of type double.
     * The value of the amount instance variable is decreased by
     * the value of the parameter. However, if the value of amount is
     * decreased below 0, amount is set to 0.
     */

        public void useGas(double gal) {

            ammount-=gal;
            if(ammount<0){
                ammount=0;
            }
        }

    /**
     * isEmpty() that accepts no parameters. isEmpty returns
     * a boolean value: true if the value of amount is less than 0.1,
     * and false otherwise.
     */

        public boolean isEmpty() {
            if(ammount<0.1){
                return true;
            }

            return false;
        }

    /**
     *  isFull() that accepts no parameters. isFull returns a boolean value:
     *  true if the value of amount is greater than capacity-0.1, and false otherwise.
     */

        public boolean isFull() {
            if(ammount>(capaciy-0.1)){
                return true;
            }

            return false;
        }

    /**
     * getGasLevel() that accepts no parameters.
     * getGasLevel returns the value of the amount instance variable.
     */

        public double getGasLevel() {

            return ammount;
        }

    /**
     *  fillUp() that accepts no parameters. fillUp increases
     *  amount to capacity and returns the difference between
     *  the value of capacity and the original value of amount
     *  (that is, the amount of gas that is needed to fill the tank to capacity).
     */


    public double fillUp() {


       double difference=capaciy-ammount;
        ammount=capaciy;




        return difference;
    }


}
