package saim_tasks.nested_loops;

public class CamelCase {
    public static void main(String[] args) {

        //thisHasManyWordsToFind
        //find how many words

        String str = "thisHasManyWordsToFind";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='A'&&str.charAt(i)<='Z') {
              count++;
            }

        }
        System.out.println(count);








    }
}
