package repl_it.oop;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    boolean isPersian;

    public Carpet() {

        width=300;
        length=300;
        totalPrice=200;
        isPersian=false;
        unitPrice=0;

    }

    public Carpet(double width,double length,double unitPrice,boolean isPersian) {

        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

       if (isPersian){
           totalPrice = ((length + width)*unitPrice) + 200;
       } else {
           totalPrice = (length + width)*unitPrice;
       }


    }

















}
