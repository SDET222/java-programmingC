package saim_tasks;

public class MergeStrings {
    public static void main(String[] args) {

        String a = "Ferrari";
        String b = "Lambo";
        String c = "";
        for (int i = 0; i < a.length() || i<b.length() ; i++) {

            if(i<a.length()) {
                c+=a.charAt(i);
            }
            if (i<b.length()) {
                c+=b.charAt(i);
            }


        }
        System.out.println(c);



    }
}
