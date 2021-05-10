package review;

public class ArrayInnerOuter {
    public static void main(String[] args) {

        int[] inner ={5, 14, 45};
        int[] outter = {24, 58, 663, 457, 5, 45, 14};
        int count =0;
        boolean match = false;
        for(int eachIn:inner) {

            for(int eachOut:outter) {
                if(eachIn==eachOut){
                  count++;
                  break;
                }
            } if (count==inner.length){
                match=true;
            }

        }
        System.out.println(match);







    }
}
