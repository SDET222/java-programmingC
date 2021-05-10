package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {

        int num = 100;
        System.out.println("num = " + num);

        Integer n = new Integer(500);
        System.out.println("Is n 500? = "+n.equals(500));
        System.out.println(n+300);

        Integer intObject = 1000;
        System.out.println( intObject.intValue());
        String numStr = intObject+"";
        String numStr2 = intObject.toString();

        System.out.println(numStr);
        System.out.println("numStr2 = " + numStr2);

        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;
        Short sh = new Short((short)40);
        Short sh2 = 50;
        Integer i1 = new Integer(100);
        Integer i2 =200;
        Long l1 = new Long(300l);
        Long l2 =3455l;
        Float fl1 = new Float(5.2f);
        Float fl2 = 5.7f;
        Double d1 = new Double(345.3);
        Double d2 = 234.5;
        Character ch1 = new Character('A');
        Character ch2 = 'Q';
        Boolean bl1= new Boolean(true);
        Boolean bl2 = false;






    }
}
