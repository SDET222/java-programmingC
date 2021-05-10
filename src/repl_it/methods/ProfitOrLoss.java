package repl_it.methods;
import java.util.*;
public class ProfitOrLoss {
    public static void main(String[] args) {

        System.out.println(profits(110,150));
    }

public static String profits (int buyPrice, int sellPrice) {

        if (buyPrice<sellPrice) {
            return "profit";
        } else if (buyPrice==sellPrice){
            return "no loss";
        } else {
            return "loss";
        }
}

}
