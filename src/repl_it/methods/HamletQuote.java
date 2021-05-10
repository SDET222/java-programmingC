package repl_it.methods;

public class HamletQuote {
    public static void main(String[] args) {
        System.out.println(hamletQuote(true,true));


    }
    public static boolean hamletQuote (boolean toBe,boolean notToBe ) {
        if (toBe || notToBe){
            return true;
        } else {
            return false;
        }
    }

}
