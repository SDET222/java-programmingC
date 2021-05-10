package repl_it.methods;

public class MergeStrings {
    public static void main(String[] args) {

        //"jsaevlaenium"

        System.out.println(mergeStrings("java", "selenium"));


    }
    public static String mergeStrings(String one, String two) {
        String newS ="";


        for(int i=0; i<one.length()||i<two.length(); i++) {

            if(i<one.length()) {
                newS+=one.charAt(i);
            }
            if(i<two.length()) {
                newS+=two.charAt(i);
            }
        }


        return newS;

    }


}
