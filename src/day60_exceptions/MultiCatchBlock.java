package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {

        String str = "exception";

        try{

            System.out.println("length: " + str.length());
            System.out.println(str.substring(20));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException caught and handled, please check if String has valid value");
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Index is wrong, please check if you entered valid index");
        }catch(Throwable t) {
            System.out.println("Any exception");
            System.out.println("Reason = " + t.getCause());
        }
        System.out.println("More code here");
    }
}
