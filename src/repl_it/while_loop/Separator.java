package repl_it.while_loop;

public class Separator {
    public static void main(String[] args) {

        String word = "baku";
        String sep = "<>";
        //String wordS= word+sep;
        int count = 4;
        String big = "";

        for (int i = 0; i < count; i++) {
            big += word + sep;

        }

        System.out.println(big);
        big = big.substring(0,big.lastIndexOf(sep));

        System.out.println(big);



        /** for(int i = 0; i< count; i++){

         big+= word+separator;

         }
         int a = big.lastIndexOf(big.charAt(word.length()));
         System.out.println(big.substring(0, a)); */









    }
}
