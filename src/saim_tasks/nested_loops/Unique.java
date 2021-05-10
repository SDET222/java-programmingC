package saim_tasks.nested_loops;

public class Unique {
    public static void main(String[] args) {


        String str = "AAABBBCCCDgF";
        String unique ="";
        int count = 0;
        for (int i = 0; i<str.length(); i++) {
           count =0;
            for (int j = 0 ; j<str.length(); j++) {

                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            } if (count==1){
                unique+=str.charAt(i);
            }

        }
        System.out.println(unique);











    }

}
